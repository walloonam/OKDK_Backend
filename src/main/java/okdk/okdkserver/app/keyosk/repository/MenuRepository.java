package okdk.okdkserver.app.keyosk.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
