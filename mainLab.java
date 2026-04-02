import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;


public class mainLab {
    public static void main(String[] args) {
        String[][] labirinto = new String[10][12];
        String[] carac = {" . " , " # "};
        int count = 0;
        labirinto[0][1] = " P ";
        labirinto[9][10] = " S ";
		labirinto[0][2] = " . ";
		labirinto[1][1] = " . ";
		labirinto[1][2] = " . ";
        labirinto[8][9] = " . ";
        labirinto[8][10] = " . ";
        labirinto[9][9] = " . ";
					
        
        System.out.println("");

        //Gerador do labirinto
        for(int i = 0; i < labirinto.length; i++){                              //Gerador de linhas
            for(int j = 0; j < labirinto[i].length; j++){                       //Gerador de colunas
                if (j == 0 || j == 11) {                                        //Posicionador de barras verticais, delimitando o espaço do labirinto
                    labirinto[i][j] = "|";
                }else if(labirinto[i][j] == null && labirinto[i][j] != " P " && labirinto[i][j] != " S "){                              //Posicionador dos caracteres chamado pelo classe Random que escolhe entre "." e "#"
                    Random random = new Random();
                    labirinto[i][j] = carac[random.nextInt(carac.length)]; 
                    if (labirinto[i][j].equals(" # ")) {                        //Contador de jogos da velha
                        count++;
                        if (count == 8) {                                       //Limitador de jogos da velha, neste caso, uma linha pode conter, até, 8 jogos da velha. 
                            for(int k = j + 1; k < labirinto[i].length; k++){
                                if (labirinto[i][k] == null || (!labirinto[i][k].equals(" P ") && !labirinto[i][k].equals(" S "))){
                                    labirinto[i][k] = " . ";
                                }
                            }
                            count = 0;
                        }
                    }
                } 
                System.out.print(labirinto[i][j]);
            }
            System.out.println();
        }
    }
}