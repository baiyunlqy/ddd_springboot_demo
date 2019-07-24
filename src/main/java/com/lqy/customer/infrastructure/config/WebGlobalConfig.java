package com.lqy.customer.infrastructure.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * @ClassName WebMvcConfig
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/16 9:05
 * @Version 1.0
 * @Update
 */
@Configuration
public class WebGlobalConfig implements WebMvcConfigurer {
    @Value("${spring.jackson.date-format:yyyy-MM-dd HH:mm:ss}")
    private String pattern;

    /**
     * @Description 对请求的日期类格式进行转换的设置
     * @Param []
     * @Return org.springframework.format.Formatter<java.util.Date>
     * @Cteator lqy
     * @Date 2019/7/16 10:53
     * @Updater
     * @Date
     */

    @Bean
    public Formatter<Date> dateFormatter() {
        return new Formatter<>() {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);

            @Override
            public Date parse(String text, Locale locale) throws ParseException {
                Date date = null;
                try {
                    date = sdf.parse(text);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return date;
            }

            @Override
            public String print(Date object, Locale locale) {
                return sdf.format(object);
            }
        };
    }

    @Bean
    public Formatter<LocalDate> localDateFormatter() {
        return new Formatter<>() {
            @Override
            public LocalDate parse(String text, Locale locale) throws ParseException {
                return LocalDate.parse(text, DateTimeFormatter.ISO_LOCAL_DATE);
            }

            @Override
            public String print(LocalDate object, Locale locale) {
                return DateTimeFormatter.ISO_LOCAL_DATE.format(object);
            }
        };
    }

    @Bean
    public Formatter<LocalDateTime> localDateTimeFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return new Formatter<>() {
            @Override
            public String print(LocalDateTime localDateTime, Locale locale) {

                return formatter.format(localDateTime);
            }

            @Override
            public LocalDateTime parse(String text, Locale locale) throws ParseException {
                return LocalDateTime.parse(text, DateTimeFormatter.ofPattern(pattern));
            }
        };
    }

    /**
     * @Description jackson序列化, 反序列化设置
     * @Param []
     * @Return com.fasterxml.jackson.databind.ObjectMapper
     * @Cteator lqy
     * @Date 2019/7/16 10:52
     * @Updater
     * @Date
     */

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS).registerModule(javaTimeModule);
        return objectMapper;
    }

    public class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {
        @Override
        public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException {
            gen.writeString(value.format(DateTimeFormatter.ofPattern(pattern)));
        }
    }

    public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
        @Override
        public LocalDateTime deserialize(JsonParser p, DeserializationContext deserializationContext)
                throws IOException {
            return LocalDateTime.parse(p.getValueAsString(), DateTimeFormatter.ofPattern(pattern));
        }
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*")
                .allowedMethods("GET", "HEAD", "POST","PUT", "DELETE", "OPTIONS")
                .allowCredentials(true).maxAge(3600);

    }
}