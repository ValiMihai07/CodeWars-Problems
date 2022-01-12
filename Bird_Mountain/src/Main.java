
public class Main {

	public static void main(String[] args) {
		char[][] mountain = {
						      "^^^^^^        ".toCharArray(),
						      " ^^^^^^^^     ".toCharArray(),
						      "  ^^^^^^^     ".toCharArray(),
						      "  ^^^^^       ".toCharArray(),
						      "  ^^^^^^^^^^^ ".toCharArray(),
						      "  ^^^^^^      ".toCharArray(),
						      "  ^^^^        ".toCharArray()
						    }; 
		int result = 0;
        boolean whileBool = true;
        while (whileBool) {
            boolean increaseResult = false;
            whileBool = false;
            char[][] newMountain = new char[mountain.length][];
            for (int i = 0; i < mountain.length; i++) newMountain[i] = mountain[i].clone();

            for (int y = 0; y < mountain.length; y++) {
                for (int x = 0; x < mountain[y].length; x++) {
                    if (isOnTheEdge(y, x, mountain)) {
                        if (mountain[y][x] != ' ') {
                        	increaseResult = true;
                            newMountain[y][x] = ' ';
                        }
                    } else whileBool = true;
                }
            }
            mountain = newMountain;
            if (increaseResult) result++;
        }
        System.out.println(result);
    }

	    private static boolean isOnTheEdge(int y, int x, char[][] mountain) {
	        if (y == 0 || x == 0 || y == mountain.length -1 || x == mountain[0].length - 1) return true;
	        char[] borders = { mountain[y+1][x], mountain[y-1][x], mountain[y][x+1], mountain[y][x-1] };
	        for (char border : borders) {
	            if (border == ' ') return true;
	        }
	        return false;
	    }

	}

