package programmers.lv2;

import java.util.*;

class StarIntersection {
    private static class Point {
        private final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    private Point intersect(long a1, long b1, long c1, long a2, long b2, long c2) {
        if (a1 * b2 - b1 * a2 == 0) {
            return null;
        }

        double x = (double) (b1 * c2 - c1 * b2) / (a1 * b2 - b1 * a2);
        double y = (double) (c1 * a2 - a1 * c2) / (a1 * b2 - b1 * a2);

        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }

        return new Point((long) x, (long) y);
    }

    private Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < x) {
                x = p.x;
            }
            if (p.y < y) {
                y = p.y;
            }
        }

        return new Point(x, y);
    }

    private Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x) {
                x = p.x;
            }
            if (p.y > y) {
                y = p.y;
            }
        }

        return new Point(x, y);
    }

    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersect(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);

                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }

        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        for (Point p: points) {
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);

            arr[y][x] = '*';
        }

        String[] answer = new String[arr.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }

        return answer;
    }
}