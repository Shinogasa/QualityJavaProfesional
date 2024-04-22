package projava;


import java.util.ArrayDeque;

public class TraverseDeep {
    public static void main(String[] args) {
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1},
                {1, 0, 1, 0, 0, 2, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        traverse(map, 1, 1);
        char[] ch = {'.', '*', 'G', 'o'};
        for (int[] row : map) {
            for (int cell : row) {
                System.out.print(ch[cell]);
            }
            System.out.println();
        }
    }

    static boolean traverse(int[][] map, int curX, int curY) {
//        switch (map[curY][curX]) {
//            case 0:
//                break;
//            case 2:
//                return true;
//            default:
//                return false;
//        }
//        map[curY][curX] = 3;
//        if (traverse(map, curX + 1, curY) ||
//                traverse(map, curX - 1, curY) ||
//                traverse(map, curX, curY + 1) ||
//                traverse(map, curX, curY - 1)) {
//            return true;
//        }
//        map[curY][curX] = 0;
//        return false;
//
        record Position(int x, int y) {}

        var stack = new ArrayDeque<Position>();
        stack.push(new Position(curX, curY));
        for(Position p; (p = stack.pollFirst()) != null ;) {
            switch(map[p.y][p.x]){
                case 0: break;
                case 2: return true;
                default: continue;
            }
            map[p.y()][p.x()] = 3;
            stack.push(new Position(p.x() + 1, p.y()));
            stack.push(new Position(p.x() - 1, p.y()));
            stack.push(new Position(p.x(), p.y() + 1));
            stack.push(new Position(p.x(), p.y() - 1));
        }
        return false;
    }
}
