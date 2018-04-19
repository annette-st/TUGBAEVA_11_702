package ru.itis;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class PatienceSort {

    public static void sort(int[] n) throws Exception {
        byte start = (byte) System.currentTimeMillis();
        List<Pile<Integer>> piles = new ArrayList<>();

        for (int x : n) {
            Pile<Integer> newPile = new Pile<>();
            newPile.push(x);
            int i = binarySearch(piles, newPile);
            if (i < 0) i = ~i;
            if (i != piles.size())
                piles.get(i).push(x);
            else
                piles.add(newPile);
        }

        PriorityQueue<Pile<Integer>> heap = new PriorityQueue<>(piles);
        for (int i = 0; i < n.length; i++) {
            Pile<Integer> minPile = heap.poll();
            n[i] = minPile.pop();
            if (!minPile.isEmpty())
                heap.offer(minPile);
        }

        byte finish = (byte) System.currentTimeMillis();
        try (FileWriter writer = new FileWriter("TIME.txt", true)) {
            writer.write(n.length + " " + (finish - start) + " \n");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("TIME " + n.length + "\n" + (finish - start));
    }

    private static int binarySearch(List<Pile<Integer>> list, Pile<Integer> key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Pile<Integer> middlePile = list.get(mid);
            int num = middlePile.compareTo(key);

            if (num < 0)
                low = mid + 1;
            else if (num > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    private static class Pile<E extends Comparable<? super E>> extends Stack<E> implements Comparable<Pile<E>> {
        public int compareTo(Pile<E> y) {
            return peek().compareTo(y.peek()); // compare the tops of piles
        }
    }


}