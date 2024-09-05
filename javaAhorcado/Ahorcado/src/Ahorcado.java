import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
       

        //clase scanner nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);


        //Declaaciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
         boolean palabraAdivinada = false;
    
         //Arreglos
         char[] letraAdivinada = new char[palabraSecreta.length()];


         //Estructura de control iterativa : bucle
         for (int i = 0; i < letraAdivinada.length; i++){
            letraAdivinada[i] = '_';
         }

         //Estructura de control iterativa : bucle
         while (!palabraAdivinada && intentos < intentosMaximos){
           //Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar : " + String.valueOf(letraAdivinada) + "(  " + palabraSecreta.length() + " letras )" );
            System.out.println("Ingrese una letra");
            char letra =Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for(int i = 0; i < palabraSecreta.length(); i++ ){

                //Estructura de control condicional 
                if(palabraSecreta.charAt(i) == letra){
                    letraAdivinada[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta){
                intentos++;
                System.out.println( "INCORRECTO! te quedan " + (intentosMaximos- intentos) +" intentos");
            }


            if (String.valueOf(letraAdivinada).equals(palabraSecreta) ){
                palabraAdivinada = true;
                System.out.println("Felicidades , has adivinado la palabra secreta " + palabraSecreta);
            }
         }
         if(!palabraAdivinada){
            System.out.println("Que pena , te has quedado sin intentos!!! GAME OVER ");
         }

         scanner.close();

    }
}
