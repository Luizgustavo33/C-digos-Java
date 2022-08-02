package br.com.crud.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Contato;

public class ContatoDAO {

	public void save(Contato contato) {

		String sql = "INSERT INTO contatos(nome,idade,dataCadastro)" + "VALUES(?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
	
			pstm.setString(1, contato.getnome());
			pstm.setInt(2, contato.getidade());
			pstm.setDate(3, new Date(contato.getdataCadastro().getTime()));
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int id) {
		String sql = "DELETE FROM contatos WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			try {
				if (pstm != null) {
					pstm.close();

				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void uptade(Contato contato) {

		String sql = "UPDATE contatos SET nome =  ?, idade = ?, dataCadastro = ?" + "WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, contato.getnome());
			pstm.setInt(2, contato.getidade());
			pstm.setDate(3, new Date(contato.getdataCadastro().getTime()));
			pstm.setInt(4, contato.id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Contato> getContatos() {

		String sql = "SELECT * FROM contatos";

		List<Contato> contatos = new ArrayList<Contato>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {

				Contato contato = new Contato();

				contato.setId(rset.getInt("id"));
				contato.setnome(rset.getString("nome"));
				contato.setidade(rset.getInt("idade"));
				contato.setdataCadastro(rset.getDate("dataCadastro"));

				contatos.add(contato);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return contatos;
	}

}
