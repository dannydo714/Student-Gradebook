
public class dfdssg {

	public static void main(String[] args) {
		
		int[][]asd = new int[10][5]; //10 indexes with 5 indexes in each that hold ints
        for(int i = 0; i<10; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                asd[i][j] = (int)(Math.random()*9);
            }
        }
        for(int c = 0; c<10; c++)
        {
            for(int x = 0; x < 5; x++)
            {
                System.out.print(asd[c][x]);
            }
            System.out.println("");
        }
		
		
	}

}
