package ru.achernyavskiy0n.springbootdatamongodbexample.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 11.08.2020
 *
 * @author a.chernyavskiy0n
 */
@Data
@Getter
@Setter
@Document(collection = "logins")
public class Employee{
    @Id
    private @NonNull Integer id;
    @Indexed
    private @NonNull String username;
    private @NonNull String password;
}
