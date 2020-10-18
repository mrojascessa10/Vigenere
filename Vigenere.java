/*
Marco Rojas-Cessa
Mr. Konstantinovich
Cybersecurity
Vigenere Assignment due 10/19/20
*/
public class Vigenere{
  private static char[] alphabet ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
  public static void quickEncode(char plaintext, char key){
    int adding = 0;
    int base = 0;
    for(int i = 0; i < 26; i++){
      if (key == alphabet[i]) adding = i;
      if (plaintext == alphabet[i]) base = i;
    }
    int index = 0;
    if (base + adding < 26) index = base + adding;
    else index = (base + adding) % 26;
    System.out.print(alphabet[index]);
  }
  public static void quickDecode(char ciphertext, char key){
    int subtracting = 0;
    int base = 0;
    for(int i = 0; i < 26; i++){
      if (key == alphabet[i]) subtracting = i;
      if (ciphertext == alphabet[i]) base = i;
    }
    int index = 0;
    if (base - subtracting > -1) index = base - subtracting;
    else index = 26 + (base - subtracting);
    System.out.print(alphabet[index]);
  }
  public static void vigenere(String text, String keytext, boolean which){
    int index = 0;
    for(int i = 0; i < text.length(); i++){
      if (which) quickEncode(text.charAt(i),keytext.charAt(index));
      else quickDecode(text.charAt(i),keytext.charAt(index));
      index++;
      index = index % keytext.length();
    }
  }
  public static void main(String [] args){
    String method = args[0];
    String text = args[1];
    String keytext = args[2];
    boolean which = true;
    if(method.charAt(0) == 'd') which = false;
    vigenere(text, keytext, which);
  }
}
