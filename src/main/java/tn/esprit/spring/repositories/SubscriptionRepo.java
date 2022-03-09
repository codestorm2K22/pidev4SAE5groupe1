package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entites.Subscription;
@Repository
public interface SubscriptionRepo extends JpaRepository<Subscription,Long> {
}
