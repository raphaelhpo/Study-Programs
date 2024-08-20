
import javax.swing.JOptionPane;
/*pegue o parâmetro str sendo passado e determine se a string é um nome de usuário válido de acordo com as seguintes regras:

1. O nome de usuário tem entre 4 e 25 caracteres.
2. Deve começar com uma letra.
3. Pode conter apenas letras, números e o caractere sublinhado.
4. Não pode terminar com um caractere sublinhado.

Se o nome de usuário for válido, seu programa deve retornar a string true , caso contrário, retornar a string false .*/	
public class CodEstudo001 {
    public static boolean isNumeric(String value) {
        try{
            Integer.parseInt(value);
            return true;
        }catch(NumberFormatException e) {
            return false;
        }
    }
    
    public static int CodelandUsernameValidation(String str) {
        Character[] caracters = new Character[25];
        int i;
        if(str.length()>=25 || str.length()<=4) { 
            return JOptionPane.showConfirmDialog(null, "False"); 
        }else if(str.endsWith("_")) {
            return JOptionPane.showConfirmDialog(null, "False");
        }else if(!Character.isLetter(str.charAt(0))) {
            return JOptionPane.showConfirmDialog(null, "False"); 
        }
        for(i=0;i<str.length();i++) {
            caracters[i] = str.charAt(i);
        }
        
        for(i=0;i<str.length();i++) {
            String a = caracters[i] + "";
            
            if(Character.isAlphabetic(caracters[i]) || isNumeric(a) || a.contains("_")){
                System.out.println(a);
            }else{
                return JOptionPane.showConfirmDialog(null, "False");
            }
        } 
        return JOptionPane.showConfirmDialog(null, str); 
    }
    
  public static void main (String[] args) {  

        
        String a = JOptionPane.showInputDialog(null, "Digite seu UserName:");
        CodelandUsernameValidation(a);
      // keep this function call here     
      /*
       * Scanner s = new Scanner(System.in);
       * System.out.print(CodelandUsernameValidation(s.nextLine()));
       */
    }
}
