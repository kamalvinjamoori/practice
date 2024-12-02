package com.example.rk_personal.HashMap;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CustomHashMap {
    static class MyHashMap<K,V>{
        private LinkedList<Node>[] buckets;
        private int N; //buckets
        private int n; // nodes
        private class Node{
            K key;
            V val;

            Node(K key, V val) {
                this.key = key;
                this.val = val;
            }
        }

        public MyHashMap(){
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++){
                buckets[i] = new LinkedList<>();
            }
        }



        //put()
        private int hashCode1(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;

        }
        private int listIndex(K key,LinkedList<Node> list){
            for(int i=0; i<list.size(); i++){
                Node node = list.get(i);
                if(node.key == key){
                    return i;
                }
            }
            return -1;
        }
        public void put(K key,V value){
            int bucketIndex = hashCode1(key);
            LinkedList<Node> list = buckets[bucketIndex];
            int li = listIndex(key,list);

            if(li == -1){
                Node newNode = new Node(key,value);
                buckets[bucketIndex].add(newNode);
                n++;
            }else{
                Node node = buckets[bucketIndex].get(li);
                node.val = value;

            }
        }


        //get()

        public V get(K key){
            int bucketIndex = hashCode1(key);
            LinkedList<Node> list = buckets[bucketIndex];
            int li = listIndex(key,list);

            if(li == -1){
                return null;
            }else{
                return list.get(li).val;
            }
        }

        //containsKey()

        public boolean containsKey(K key){
            int bucketIndex = hashCode1(key);
            LinkedList<Node> list = buckets[bucketIndex];
            int li = listIndex(key,list);
            return li != -1;
        }

        //keySet()

        public Set<K> keySet(){
            Set<K> keySet = new HashSet<K>();
            for(int i=0; i<N; i++){
                for(int j=0; j<buckets[i].size(); j++){
                    keySet.add(buckets[i].get(j).key);
                }
            }
            return keySet;
        }

        public int size(){
            return n;
        }

        //remove()

        public int remove(K key){
           return n;
        }


    }

    public static void main(String[] args) {
        MyHashMap<String,Integer> map = new MyHashMap<>();
        map.put("India",120);
        map.put("China",100);
        map.put("India",130);
        map.put("India",140);

        System.out.println(map.size());
        System.out.println(map.get("India"));


    }

}
