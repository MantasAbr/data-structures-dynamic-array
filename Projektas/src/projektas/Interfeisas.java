/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektas;

/**
 *
 * @author Vartotojas
 */
interface Interfeisas<T> {
    void add(T auto);
    void growSize();
    void shrinkSize();
    void addAt(int index, T auto);
    void remove();
    void removeAt(int index);
    boolean contains(T auto);
    int count();
    T get(int sk);
    void sort();
}
