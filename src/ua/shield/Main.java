package ua.shield;

import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sa on 29.12.16.
 */
public class Main {
    final String packageName="ua.shield";

    public static void main(String[] args) {

    }

    public static void createMenu(String [] arr){
        System.out.println("Выберите нужный пункт");
        System.out.println("Для выхода нажмите 0");
        for(int i=1;i<=arr.length;i++){
            System.out.println(i+ " "+arr[i]);
        }

        Scanner scanner=new Scanner(System.in);
        int selectedItem=scanner.nextInt();

    }

    List<Class<?>> getAnnotationClass(){
        List<Class<?>> listClasses=new ArrayList<>();

    return  listClasses;
    }
}
