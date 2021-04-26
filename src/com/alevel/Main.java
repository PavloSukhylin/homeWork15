package com.alevel;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        TreeSet<String> treeSet = new TreeSet<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        HashSet<String> hashSet = new HashSet<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();


        //создаем элементы списка класса ArrayList
        arrayList.add("testValue1");
        arrayList.add("testValue2");
        arrayList.add("testValue3");
        arrayList.add("testValue4");
        System.out.println(arrayList);//выводим на печать
        //убираем из списка элементы,содержащие "3"
        List<String> collect = arrayList.stream().filter(string -> !string.contains("3")).collect(Collectors.toList());
        System.out.println(collect); //печать

        arrayList.removeIf(string -> true);//удаляем из списка все элементы по условию "если содержится элемент"
        System.out.println(arrayList); //печать

        System.out.println("TreeSet operations");
        treeSet.add("treeSet1");
        treeSet.add("treeSet2");
        treeSet.add("treeSet3");

        System.out.println(treeSet);
        treeSet.removeIf(string -> true);
        System.out.println(treeSet);

        System.out.println("ArrayDeque operations");
        queue.add("ArrayDeque1");
        queue.add("ArrayDeque2");
        queue.add("ArrayDeque3");

        System.out.println(queue);
        queue.remove("ArrayDeque1");
        System.out.println(queue);
        queue.removeIf(string -> true);
        System.out.println(queue);

        System.out.println("HashSet operations");
        hashSet.add("HashSet1");
        hashSet.add("HashSet2");
        hashSet.add("HasSet3");
        System.out.println("Размер коллекции:" + hashSet.size());

        System.out.println(hashSet);
        hashSet.removeIf(string -> true);
        if (hashSet.isEmpty()) {
            System.out.println(hashSet);
        }
        System.out.println("LinkedList operations");
        linkedList.add(1);
        linkedList.addFirst(34);
        linkedList.addLast(453);
        System.out.println(linkedList);
        while (!linkedList.isEmpty()) {
            linkedList.removeFirst();
        }
        System.out.println(linkedList);

        System.out.println("PriorityQueue operations");
        priorityQueue.add(23);
        priorityQueue.add(67);
        priorityQueue.offer(123);
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()) {
            priorityQueue.poll();
            System.out.println(priorityQueue);
        }

        System.out.println("LinkedHashSet operations");
        linkedHashSet.add(23);
        linkedHashSet.add(32);
        linkedHashSet.add(908);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());
        linkedHashSet.remove(32);
        linkedHashSet.remove(23);
        System.out.println(linkedHashSet);
        linkedHashSet.remove(908);

        System.out.println("HashMap operations");
        hashMap.put(143, "Maria");
        hashMap.put(3156, "Petr");
        hashMap.put(373, "Andrew");
        System.out.println(hashMap);
        hashMap.remove(143);
        System.out.println(hashMap);
        hashMap.remove(3156);
        hashMap.remove(373);
        System.out.println(hashMap);

        System.out.println("treeMap operations");
        treeMap.put(1, "number1");
        treeMap.put(2, "number2");
        treeMap.putIfAbsent(3, "number3");
        System.out.println(treeMap);
        treeMap.entrySet().removeIf(var ->true); //подсмотрел в нете метод entrySet() и использовал removeIf()
        System.out.println(treeMap);

        System.out.println("LinkedHashMap operations");
        linkedHashMap.put(21,"Joahn");
        linkedHashMap.put(45,"Ann");
        linkedHashMap.put(44,"Helen");
        System.out.println(linkedHashMap);
        linkedHashMap.entrySet().removeIf(var ->true);
        System.out.println(linkedHashMap);




    }
}
//Создать хотя бы по одному экземпляру класса (ArrayList, HashMap и тд)  основных интерфейсов коллекций (List, Set, Queue, Deque и Map)
//В каждый экземпляр коллекции добавить несколько элементов, вывести все элементы в консоль, удалить все элементы из коллекции (не используя метод clear())
//Выучить иерархию классов (интерфейсов) коллекции и методы которые есть в коллекциях

