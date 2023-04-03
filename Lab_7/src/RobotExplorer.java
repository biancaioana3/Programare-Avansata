import java.util.*;

public class RobotExplorer {

    private final int[][] map;
    private final int n;
    private final List<Robot> robots;
    private final List<Integer> tokens;
    private final Set<Integer> visited;

    public RobotExplorer(int n, int numRobots) {
        this.n = n;
        this.map = new int[n][n];
        this.robots = new ArrayList<>();
        this.tokens = new ArrayList<>();
        this.visited = new HashSet<>();
        for (int i = 1; i <= n * n * n; i++) {
            tokens.add(i);
        }
        Collections.shuffle(tokens);
        for (int i = 1; i <= numRobots; i++) {
            robots.add(new Robot("Robot" + i));
        }
    }

    public synchronized int getNextToken() {
        if (tokens.isEmpty()) {
            return -1; // signal that all tokens have been used
        }
        return tokens.remove(0);
    }

    public synchronized boolean isVisited(int i, int j) {
        return visited.contains(i * n + j);
    }

    public synchronized void setVisited(int i, int j) {
        visited.add(i * n + j);
    }

    public void startExploration() {
        for (Robot robot : robots) {
            new Thread(() -> robot.explore(this)).start();
        }
    }

    private class Robot {

        private final String name;
        private int i;
        private int j;

        public Robot(String name) {
            this.name = name;
            Random random = new Random();
            this.i = random.nextInt(n);
            this.j = random.nextInt(n);
        }

        public void explore(RobotExplorer explorer) {
            while (true) {
                int di = 0;
                int dj = 0;
                while (di == 0 && dj == 0) {
                    Random random = new Random();
                    di = random.nextInt(3) - 1;
                    dj = random.nextInt(3) - 1;
                }
                int newI = i + di;
                int newJ = j + dj;
                if (newI >= 0 && newI < n && newJ >= 0 && newJ < n) {
                    synchronized (explorer) {
                        if (!explorer.isVisited(newI, newJ)) {
                            explorer.setVisited(newI, newJ);
                            System.out.println(name + " visited (" + newI + "," + newJ + ")");
                            int token = explorer.getNextToken();
                            if (token == -1) {
                                return; // all tokens have been used
                            }
                            map[newI][newJ] = token;
                        }
                    }
                    i = newI;
                    j = newJ;
                }
            }
        }

    }


}
