/*
 * @KeyboardHandleModule.java
 *
 * Version 1.0 (7.07.2016)
 *
 * Распространяется под копилефтной лицензией GNU GPL v3
 *
 */

package ru.tproger.keyboard;

/**
 * Определяет параметры, которые игре необходимо считывать с клавиатуры.
 *
 * @author DoKel
 * @version 1.0
 */
public interface KeyboardHandleModule {

    /**
     * Считывание последних данных из стека событий, если можулю это необходимо
     */
    void update();

    /**
     * @return Возвращает информацию о том, был ли нажат ESCAPE за последнюю итерацию
     */
    boolean wasEscPressed();

}
