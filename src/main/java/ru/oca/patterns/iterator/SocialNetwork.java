package ru.oca.patterns.iterator;

/**
 * Интерфейс социальной сети
 */

public class SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
