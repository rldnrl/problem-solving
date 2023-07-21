package leetcode.java;

import java.util.*;

/**
 * [7,2,1,2]
 * today: 2
 * span 4
 *
 * ["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
 * [[], [100], [80], [60], [70], [60], [75], [85]]
 *
 * [null, 1, 1, 1, 2, 1, 4, 6]
 *
 * StockSpanner stockSpanner = new StockSpanner();
 * stockSpanner.next(100); // return 1
 * stockSpanner.next(80);  // return 1
 * stockSpanner.next(60);  // return 1
 * stockSpanner.next(70);  // return 2
 * stockSpanner.next(60);  // return 1
 * stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
 * stockSpanner.next(85);  // return 6
 *
 * stack = [100]
 * stack = [100, 80]
 * stack = [100, 80, 60]
 * stack = [100, 80, 60, 70]
 * stack = [100, 80, 60, 70, 60]
 * stack = [100, 80, 60, 70, 60, 75]
 * stack = [100, 80, 60, 70, 60, 75]
 *
 * stack = [75, 60, 70, 60, 80, 100]
 */
public class OnlineStockSpan {
    Stack<Integer> stack;
    public OnlineStockSpan() {
        this.stack = new Stack<>();
    }

    public int next(int price) {
        this.stack.push(price);
        List<Integer> list = new ArrayList<>();

        for (Integer element: this.stack) {
            list.add(element);
        }

        Collections.reverse(list);

        if (list.size() == 1) {
            return 1;
        }

        int result = 1;
        for (Integer element: list) {
            if (element <= price) {
                result++;
            } else {
                break;
            }
        }

        return result;
    }
}
