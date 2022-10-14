package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        throw new UnsupportedOperationException();
//        return numbers.stream().map(Math::sqrt).map(number -> Integer.parseInt(String.valueOf(number))).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).distinct().toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();

    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return Math.toIntExact(users.stream().filter(c -> c.getAge() > 25).count());
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {

        return integers.stream()
                .reduce(0, Integer::sum);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).toList();
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(name -> name.substring(0, name.indexOf(" "))).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream().map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> input) {
        return input.stream().map(User::getName).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().collect(Collectors.averagingDouble(User::getAge));
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).max().orElseThrow(NoSuchElementException::new);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).min().orElseThrow(NoSuchElementException::new);
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        throw new UnsupportedOperationException();
//        return users.stream().collect(Collectors.toMap(User::isMale, Function.identity()));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static boolean anyMatch(List<User> users, int age) {
        throw new UnsupportedOperationException();
    }

    public static boolean noneMatch(List<User> users, int age) {
        throw new UnsupportedOperationException();
    }

    public static Optional<User> findAny(List<User> users, String name) {
        throw new UnsupportedOperationException();
    }

    public static List<User> sortByAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        throw new UnsupportedOperationException();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        throw new UnsupportedOperationException();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        throw new UnsupportedOperationException();
    }

    public static User findOldest(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static int sumAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        throw new UnsupportedOperationException();
    }
}