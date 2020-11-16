package com.ezhevikina.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

  public HashSet<Integer> getUniqueElements(HashSet<Integer> hashSetRepository,
                                            ArrayList<Integer> inputList) {
    if (hasDuplicates(inputList)) {
      hashSetRepository.clear();
      return hashSetRepository;
    }

    for (int element : inputList) {
      if (hashSetRepository.contains(element)) {
        hashSetRepository.clear();
        return hashSetRepository;
      } else {
        hashSetRepository.add(element);
      }
    }
    return hashSetRepository;
  }

  public ArrayList<Integer> getUniqueElements(ArrayList<Integer> arrayListRepository,
                                              ArrayList<Integer> inputList) {
    if (hasDuplicates(inputList)) {
      arrayListRepository.clear();
      return arrayListRepository;
    }

    for (int element : inputList) {
      if (arrayListRepository.contains(element)) {
        arrayListRepository.clear();
        return arrayListRepository;
      } else {
        arrayListRepository.add(element);
      }
    }
    return arrayListRepository;
  }

  public HashSet<Integer> getHashSetRepository() {
    HashSet<Integer> hashSetRepository = new HashSet<>();
    for (int i = 0; i < 10; i++) {
      hashSetRepository.add(i);
    }
    return hashSetRepository;
  }

  public ArrayList<Integer> getArrayListRepository() {
    ArrayList<Integer> arrayListRepository = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      arrayListRepository.add(i);
    }
    return arrayListRepository;
  }

  private boolean hasDuplicates(ArrayList<Integer> arrayList) {
    Set<Integer> set = new HashSet<>(arrayList);
    return arrayList.size() > set.size();
  }
}
