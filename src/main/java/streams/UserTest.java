package streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@EqualsAndHashCode(of = {"name", "age"})
public class UserTest {

    private int id;
    private String name;
    private int age;
}
