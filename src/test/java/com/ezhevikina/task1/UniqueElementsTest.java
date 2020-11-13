package com.ezhevikina.task1;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueElementsTest {
  private UniqueElements uniqueElements = new UniqueElements();
  private final HashSet<Integer> hashSetRepository = uniqueElements.getHashSetRepository();
  private final ArrayList<Integer> arrayListRepository = uniqueElements.getArrayListRepository();

  @Test
  public void inputListHasDuplicates_ReturnEmptyHashSetRepository() {
    ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(10, 11, 10));
    HashSet<Integer> result = uniqueElements.getUniqueElements(hashSetRepository, inputList);
    assertEquals(new HashSet<>(), result);
  }

  @Test
  public void inputListHasDuplicatesWithRepository_ReturnEmptyHashSetRepository() {
    ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(9, 10, 11));
    HashSet<Integer> result = uniqueElements.getUniqueElements(hashSetRepository, inputList);
    assertEquals(new HashSet<>(), result);
  }

  @Test
  public void inputListAndRepositoryHaveNoCommonElements_ReturnHashSetRepositoryPlusInputListElements() {
    ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(10, 11, 12));
    HashSet<Integer> expected = hashSetRepository;
    expected.addAll(inputList);
    HashSet<Integer> result = uniqueElements.getUniqueElements(hashSetRepository, inputList);
    assertEquals(expected, result);
  }

  @Test
  public void emptyInputList_ReturnHashSetRepository() {
    ArrayList<Integer> inputList = new ArrayList<>();
    HashSet<Integer> result = uniqueElements.getUniqueElements(hashSetRepository, inputList);
    assertEquals(hashSetRepository, result);
  }

  @Test
  public void inputListHasDuplicates_ReturnEmptyArrayListRepository() {
    ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(10, 11, 10));
    ArrayList<Integer> result = uniqueElements.getUniqueElements(arrayListRepository, inputList);
    assertEquals(new ArrayList<>(), result);
  }

  @Test
  public void inputListHasDuplicatesWithRepository_ReturnEmptyArrayListRepository() {
    ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(9, 10, 11));
    ArrayList<Integer> result = uniqueElements.getUniqueElements(arrayListRepository, inputList);
    assertEquals(new ArrayList<>(), result);
  }

  @Test
  public void inputListAndRepositoryHaveNoCommonElements_ReturnArrayListRepositoryPlusInputListElements() {
    ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(10, 11, 12));
    ArrayList<Integer> expected = arrayListRepository;
    expected.addAll(inputList);
    ArrayList<Integer> result = uniqueElements.getUniqueElements(arrayListRepository, inputList);
    assertEquals(expected, result);
  }

  @Test
  public void emptyInputList_ReturnArrayListRepository() {
    ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(10, 11, 10));
    ArrayList<Integer> result = uniqueElements.getUniqueElements(arrayListRepository, inputList);
    assertEquals(arrayListRepository, result);
  }
}
