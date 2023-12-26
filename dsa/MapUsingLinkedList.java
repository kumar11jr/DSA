import java.util.*;

class MapUsingLinkedList<K,T> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float loadFactor = 0.5f;


    public MapUsingLinkedList(){
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }


    public void put(K key ,T value){
        int hash = Math.abs(key.hashCode()% list.size());
         
        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity : entities){
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }

        if((float)(size)/list.size()>loadFactor){
            doubleHash();
        }

        entities.add(new Entity(key, value));
        size++;
    }

    private void doubleHash(){
        ArrayList<LinkedList<Entity>> old= list;
        list = new ArrayList<>();
    }



    private class Entity{
        String key;
        String value;

        public Entity(String key,String value){
            this.key = key;
            this.value = value;
        }
    }
}
