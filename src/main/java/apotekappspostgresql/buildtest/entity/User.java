package apotekappspostgresql.buildtest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")

public class User {
    public static enum Role {ADMIN, USER};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    private String email;

    private String password;

    private String name;

    private Number phone;

    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String token;

    @Column(name = "token_expired_at")
    private Long tokenExpiredAt;
}
