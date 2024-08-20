/*leia o array de strings armazenadas em strArr que conterá 2 elementos: 
  o primeiro elemento representará uma lista de números separados por vírgulas classificados em ordem crescente, 
  o segundo elemento representará uma segunda lista de números separados por vírgulas (também classificados). 
  Seu objetivo é retornar uma string separada por vírgulas contendo os números que ocorrem em elementos de strArr 
  em ordem classificada. Se não houver interseção, retorne a string false .*/
public class CodEstudo002 {
    public static String findIntersection(String[] strArr) {
        String[] valsLista1 = strArr[0].split(",");
        String[] valsLista2 = strArr[1].split(",");
        String a ="";
        
        for(int i = 0; i < valsLista1.length; i++) {
            for(int j = 0; j < valsLista2.length; j++) {
                if(Integer.parseInt(valsLista1[i]) == Integer.parseInt(valsLista2[j])) {
                    a = a.concat(valsLista1[i] + ",");
                };
          }
        }
        return a;
    }
    public static void main (String[] args) {  
      // keep this function call here
      String[] valores = new String[2];
          
      /*
       * Scanner includ1 = new Scanner(System.in);
       * System.out.println("Digite os valores da primeira lista:"); String valores_1
       * = includ1.nextLine();
       * 
       * Scanner includ2 = new Scanner(System.in);
       * System.out.println("Digite os valores da segunda lista:"); String valores_2 =
       * includ2.nextLine(); System.out.println("\n");
       */
          
      valores[0] = "15,0,2,3,4";
      valores[1] = "15,0,1,2";
          
      System.out.print("\n" + findIntersection(valores));
          
      /*
       * includ1.close(); includ2.close();
       */
    }
}
