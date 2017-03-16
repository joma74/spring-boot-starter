package at.joma.playground.starter.vuejs.dto;

import com.google.common.net.UrlEscapers;
import org.apache.tomcat.util.codec.binary.Base64;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ProjectDTO {

    private static final Random r = new SecureRandom();

    @Valid
    @NotEmpty
    private String name;

    @Valid
    @NotEmpty
    private String description;

    private final LocalDateTime dateTime = LocalDateTime.now();

    private final String key;

    public ProjectDTO() {
        byte[] b = new byte[16];
        r.nextBytes(b);
        this.key = UrlEscapers.urlPathSegmentEscaper().escape(Base64.encodeBase64String(b));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastModifiedOn() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm - dd. MMMM yyyy");
        return dateTime.format(formatter);
    }

    public String getKey() { return key; }
}
