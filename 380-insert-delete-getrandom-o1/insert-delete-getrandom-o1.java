class RandomizedSet {

    Map<Integer, Integer> myMap;
    List<Integer> myList;

    public RandomizedSet() {
        myMap = new HashMap<>();
        myList = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        //insert in list and hashmap to avoid duplicates
        if(myMap.containsKey(val))
        {
            return false;
        }

        myList.add(val);
        myMap.put(val, myList.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        //for removal we first find the position of the val in the list by searching the hashmap
        if(myMap.containsKey(val))
        {
            int pos = myMap.get(val);
            //now we put in the last element on the list to this position
            myList.set(pos, myList.get(myList.size()-1));
            //now we update the hashmap;
            myMap.put(myList.get(pos), pos);
            //now we remove from list
            myList.remove(myList.size()-1);
            //now we remove from hashmap
            myMap.remove(val);

            return true;
        }
        else
        return false;
    }
    
    public int getRandom() {
        //we use the Random class
        Random myRandomObj = new Random();
        return myList.get(myRandomObj.nextInt(myList.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */