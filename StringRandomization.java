package com.example.application;

import java.util.*;

public class StringRandomization {

    public static void main(String[] args) {
        getRandomPerson();
    }


    public static void getRandomPerson(){
            String[] name = {"Rajim", "Sudan", "Tridev", "Sabita", "Bikash", "Bishnu", "Sonam", "Biswas","Priti","Piyush","Anand","Mandeep","Chet","Nikesh","Kush","Sabina","Puran","Drona","Sumendra","BikashS"};
            Map<String, String> randomPerson = new LinkedHashMap<>();
//
            Random random = new Random();
//
            for (String person : name) {
                int index = random.nextInt(name.length);
                randomPerson.put(person,name[index]);
            }

            for(Map.Entry<String, String> per: randomPerson.entrySet()){
                int index = random.nextInt(name.length);
                String key = per.getKey();
                String value = per.getValue();
                if(!Objects.equals(key, value)){
                    break;
                }
                else {
                    List<String> keys = new ArrayList<>(randomPerson.keySet());
                    Collections.shuffle(keys);
                    randomPerson.put(key,value);
                    System.out.println(key+"="+value);
                }
            }
            System.out.println(randomPerson);
        }
        }



