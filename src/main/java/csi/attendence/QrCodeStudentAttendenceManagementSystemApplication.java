package csi.attendence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "AuditorAwareImpl",dateTimeProviderRef = "auditingDateTimeProvider")
public class QrCodeStudentAttendenceManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrCodeStudentAttendenceManagementSystemApplication.class, args);
	}

	
}
