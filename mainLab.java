import java.util.Random;

public class mainLab {
    public static void main(String[] args) {
        String[][] labirinto = new String[10][12];
        String[] carac = {" . " , " # "};
        labirinto[0][1] = " P ";
        labirinto[9][10] = " S ";
        
        System.out.println("");

        //Gerador do labirinto
        for(int i = 0; i < labirinto.length; i++){
            for(int j = 0; j < labirinto[i].length; j++){
                if (j == 0 || j == 11) {
                    labirinto[i][j] = "|";
                }else if(labirinto[i][j] == null){
                    Random random = new Random();
                    labirinto[i][j] = carac[random.nextInt(carac.length)]; 
                }
                System.out.print(labirinto[i][j]);
            }
            System.out.println();
        }
    }
}
