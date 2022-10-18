package ru.oca.patterns.iterator;

/**
 * итератор помогает перебирать профили пользователей социальной сети, не раскрывая клиентскому коду подробности коммуникации с самой сетью
 * Интерфейс итератора
 */

public class ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
