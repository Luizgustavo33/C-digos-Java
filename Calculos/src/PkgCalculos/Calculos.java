package PkgCalculos;
import java.util.StringTokenizer;

public class Calculos {	public static int findMax(int arr[]){  
    int max=arr[0];
    for(int i=1;i<arr.length;i++){  
        if(max<arr[i])  
            max=arr[i];  
    }  
    return max;  
}  
//Método para retornar um número ao cubo 
public static int cube(int n){  
    return n*n*n;  
}  

//Método para retornar as palavras em reverso  
public static String reverseWord(String str){  

    StringBuilder result=new StringBuilder();  
    StringTokenizer tokenizer=new StringTokenizer(str,"");  

    while(tokenizer.hasMoreTokens()){  
    StringBuilder sb=new StringBuilder();  
    sb.append(tokenizer.nextToken());  
    sb.reverse();  

    result.append(sb);  
    result.append("");  
    }  
    return result.toString();  
}  
}


