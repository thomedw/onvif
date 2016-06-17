package org.baeldung.persistence.dao;

import org.baeldung.persistence.model.OnvifCamera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnvifCamerasRepository extends JpaRepository<OnvifCamera, Long> {
}


