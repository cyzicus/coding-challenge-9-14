package us.cyzic.codingchallenge914.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Person {
    private final String firstName;
    private final String lastName;
}
