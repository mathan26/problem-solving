| Feature                         | **Old API (`java.util.Date`, `java.util.Calendar`)**                 | **New API (`java.time` package)**                           |
| ------------------------------- | -------------------------------------------------------------------- | ----------------------------------------------------------- |
| ✅ **Design**                    | Mutable, not thread-safe                                             | Immutable, thread-safe                                      |
| ✅ **Package**                   | `java.util.Date`, `java.util.Calendar`, `java.text.SimpleDateFormat` | `java.time.*`                                               |
| ✅ **Thread Safety**             | ❌ Not thread-safe (e.g., `SimpleDateFormat`)                         | ✅ Thread-safe                                               |
| ✅ **Ease of Use**               | Clumsy and error-prone                                               | Fluent and readable API                                     |
| ✅ **Immutability**              | ❌ Mutable objects                                                    | ✅ All classes are immutable                                 |
| ✅ **Date Arithmetic**           | Complex using `Calendar.add()`                                       | Simple: `plusDays()`, `minusWeeks()` etc.                   |
| ✅ **Formatting/Parsing**        | `SimpleDateFormat` (not thread-safe)                                 | `DateTimeFormatter` (immutable, thread-safe)                |
| ✅ **Null-based Month Indexing** | Months are 0-based (`0 = January`)                                   | Months are enums (`Month.JANUARY`)                          |
| ✅ **Clear Class Design**        | Mixed concern: time + date in one class (`Date`)                     | Clear separation: `LocalDate`, `LocalTime`, `LocalDateTime` |
| ✅ **Time Zones**                | Difficult with `Calendar` and `TimeZone`                             | Easy with `ZonedDateTime`, `ZoneId`                         |
| ✅ **ISO 8601 Support**          | Limited                                                              | Full support                                                |
| ✅ **Extensibility**             | Hard to extend                                                       | Extensible, rich API                                        |
