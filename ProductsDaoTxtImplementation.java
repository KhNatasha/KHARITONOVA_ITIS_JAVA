package com.company;

import java.io.*;

import static java.util.Arrays.swap;

public class ProductsDaoTxtImplementation implements ProductsDao {
    @Override
    public boolean exists(String product) throws IOException {
        boolean exists = false;
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        while (str != null){
            if (str.equals(product)){
                exists = true;
            }
            str = br.readLine();
        }
        return exists;
    }

    @Override
    public void add(String product) throws IOException {
        File file = new File("products.txt");
        Writer writer = new FileWriter(file, true);
        BufferedWriter wr = new BufferedWriter(writer);
        wr.write(product);
        wr.flush();
    }

    @Override
    public void remove(String product) throws IOException {
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        int size = size();
        String[] arr = new String[size];
        int indexofproduct = 0;
        for (int i = 0; i < size; i++) {
            String str = br.readLine();
            arr[i] = str;
            if(str.equals(product))
                indexofproduct = i;
        }

        for (int i = 0; i < size - 1; i++) {
            if(arr[i].equals(product))
                swap(arr, i, i + 1);
        }

        arr[size - 1] = "";

        file = new File("products.txt");
        Writer writer = new FileWriter(file, false);
        BufferedWriter wr = new BufferedWriter(writer);
        writer = new FileWriter(file, true);
        wr = new BufferedWriter(writer);
        for (int i = 0; i < size - 1; i++) {
            add(arr[i]);
            wr.newLine();
            wr.flush();
        }
    }



    //считать все продукты в массив (массив размера size())
        //удаляете из массива product, записываете всё содержимое массива в файл
    @Override
    public void replace(String product1, String product2) throws IOException {
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        int size = size();
        String[] arr = new String[size];
        int indexofproduct1 = 0;
        for(int i = 0; i < size; i++){
            String str = br.readLine();
            arr[i] = str;
            if (str.equals(product1)){
                indexofproduct1 = i;
            }
        }
        for (int i = 0; i < size; i++) {
            if(arr[i].equals(product1)){
                arr[i] = product2;
            }
        }

        for (int i = 0; i < size; i++) {

        }


        file = new File("products.txt");
        Writer writer = new FileWriter(file, false);
        BufferedWriter wr = new BufferedWriter(writer);
        writer = new FileWriter(file, true);
        wr = new BufferedWriter(writer);

        for (int i = 0; i < size; i++) {
            add(arr[i]);
            wr.newLine();
            wr.flush();
        }
    }


    /**
     * Считает количество продуктов в файле
     * @return число продуктов
     */
    int size() throws IOException {
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        int count = 0;
        while (str != null)
        {
            count++;
            str = br.readLine();
        }
        return count;
    }
}
