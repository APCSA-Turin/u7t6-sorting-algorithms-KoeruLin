package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) 
    {
        for (int i = 1; i < elements.length; i++)
        {
            int num = elements[i];
            int j = i - 1;

            for (j = i - 1; j >= 0; j--) 
            {
                if (elements[j] > num)
                {
                    elements[j + 1] = elements[j];
                }
                else
                {
                    break;
                }
            }

            elements[j + 1] = num;
        }

        return elements;
    }

   
    public static void selectionSort(int[] elements) 
    {
        for (int i = 0; i < elements.length - 1; i++)
        {
            int min = i;

            for (int j = i + 1; j < elements.length; j++)
            {
                if (elements[j] < elements[min])
                {
                    min = j;
                }
            }

            int swap = elements[i];
            elements[i] = elements[min];
            elements[min] = swap;
        }
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) 
    {
        for (int i = 1; i < words.size(); i++)
        {
            String word = words.get(i);
            int j = i - 1;

            for (j = i - 1; j >= 0; j--) 
            {
                if (words.get(j).compareTo(word) > 0)
                {
                    words.set(j + 1, words.get(j));
                }
                else
                {
                    break;
                }
            }

            words.set(j + 1, word);
        }

        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) 
    {
        for (int i = 0; i < words.size() - 1; i++)
        {
            int min = i;

            for (int j = i + 1; j < words.size(); j++)
            {
                if (words.get(j).compareTo(words.get(min)) < 0)
                {
                    min = j;
                }
            }

            String swap = words.set(i, words.get(min));
            words.set(min, swap);
        }
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}