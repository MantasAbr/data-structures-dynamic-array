package projektas;


public class DinaminisSarasas<T extends Comparable<T>> implements Interfeisas<T>{
    
    //Objektu masyvas
    private T[] autos;
    
    //Elementu kiekis
    private int count;
    
    //Saraso dydis
    private int size;
    
    /**
     * Konstruktorius
     */
    public DinaminisSarasas(){
        autos = (T[])new Comparable[1];
        count = 0;
        size = 1;
    }
    
    /**
     * Elementu kieko grazinimo metodas
     * @return elementu kieki
     */
    @Override
    public int count(){
        return count;
    }
    
    /**
     * Dejimo i sarasa metodas
     * @param auto objekto pavadinimas
     */
    @Override
    public void add(T auto){
        if(count == size){
            growSize();
        }
        autos[count] = auto;
        count++;
    }

    /**
     * Saraso dydzio padidejimo metodas (dvigubai)
     */
    @Override
    public void growSize() {
        T[] temp = null;
        if(count == size){
            temp = (T[])new Comparable[size * 2];
            System.arraycopy(autos, 0, temp, 0, size);
        }
        
        autos = temp;
        
        size = size * 2;
    }
    
    /**
     * Saraso dydzio sumazinimo metodas
     */
    @Override
    public void shrinkSize(){
        T[] temp = null;
        if(count > 0){
            temp = (T[])new Comparable[count];
            System.arraycopy(autos, 0, temp, 0, count);
            size = count;
            autos = temp;
        }
    }
    
    /**
     * Naujo objekto iterpimo i sarasa metodas
     * @param index Iterpimo vieta
     * @param auto Objekto pavadinimas
     */
    @Override
    public void addAt(int index, T auto){
        if(count == size){
            growSize();
        }
        
        for(int i = count - 1; i >= index; i--){
            autos[i + 1] = autos[i];
        }
        
        autos[index] = auto;
        count++;
    }
    
    /**
     * Saraso salinimo metodas
     */
    @Override
    public void remove(){
        while(count > 0){
            autos[count - 1] = null;
            count--;
        }

    }
    
    /**
     * Elemento pasalinimo metodas
     * @param index Norimo elemento indeksas
     */
    @Override
    public void removeAt(int index){
        if(count > 0){
            for(int i = index; i < count - 1; i++){
                autos[i] = autos[i + 1];
            }
            autos[count - 1] = null;
            count--;
        }
    }
    
    /**
     * Contains metodas
     * @param auto Objektas patikrinimui, ar jis egzistuoja sarase
     * @return 
     */
    @Override
    public boolean contains(T auto){
        for(int i = 0; i < count; i++){
            if(autos[i].equals(auto))
                return true;
        }
        return false;
    }
    
    /**
     * Grazina pasirinkto indekso elementa
     * @param sk norimo objekto indeksas
     * @return 
     */
    @Override
    public T get(int sk){
        return (T) autos[sk];
    }
    
    /**
     * Rikiavimo metodas
     */
    @Override
    public void sort(){
        for(int i = 0; i < count; i++){
            T min = (T)autos[i];
            int minId = i;
            for(int j = i + 1; j < count; j++){
                if(autos[j].compareTo(min) < 1){
                    min = autos[j];
                    minId = j;
                }
            }
            T temp = autos[i];
            autos[i] = min;
            autos[minId] = temp;
        }
    }
}
