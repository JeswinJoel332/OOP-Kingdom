## 📋 What does this PR do?
*Brief description of the class and its role in the kingdom.*

---

## 🎯 Which abstract class does this implement?
- [ ] AbstractLumberyard
- [ ] AbstractBarracks
- [ ] AbstractBlacksmith
- [ ] AbstractMarket
- [ ] Other: ___________

---

## ✨ Key Features
- Feature 1
- Feature 2
- Feature 3

---

## 🧪 Testing
All unit tests pass locally:
```bash
mvn clean test
```
**Results:** 
- ✅ Tests Passed: [X]
- ❌ Tests Failed: [Y]
- ⏭️ Skipped: [Z]

---

## 📊 UML Diagram
*Attach your UML diagram here showing how your class relates to KingdomEntity, CityHall, and other entities.*

```mermaid
classDiagram
    class YourClass {
        <<your class details>>
    }
```

---

## ✅ Submission Checklist

**Code Quality:**
- [ ] Code follows strict naming conventions (e.g., `Lumberyard.java`, `LumberyardTest.java`)
- [ ] Only my entity class and test file were modified (no other files touched!)
- [ ] All abstract methods are implemented
- [ ] Default constructor initializes safe defaults with UUID
- [ ] Jackson `@JsonProperty` annotations present on all fields
- [ ] Static registration block included: `static { KingdomRegistry.register(YourClass.class); }`

**Testing:**
- [ ] Unit tests are comprehensive and test business logic
- [ ] Unit tests verify Jackson serialization works correctly
- [ ] All tests pass locally with `mvn clean test`
- [ ] Application boots without errors with `mvn exec:java -Dexec.mainClass="kingdom.Main"`

**CI & Documentation:**
- [ ] CI passes (GitHub Actions)
- [ ] UML diagram included showing class relationships
- [ ] No modifications to README, pom.xml, Main.java, or any configuration files
- [ ] Commit message(s) are clear and descriptive

---

## 📝 Design Notes
*Explain any key design decisions, edge cases handled, or interesting implementation choices.*

---

## 🚀 Ready for Review?
- [ ] Yes, this PR is ready for the community to review and score
- [ ] No, still working on it (mark as Draft)

---

> 💡 **Reminder:** Only 2 files may be modified in this PR:
> 1. Your implementation class (e.g., `Lumberyard.java`)
> 2. Your test class (e.g., `LumberyardTest.java`)
>
> Any other file modifications will result in automatic PR closure without merge.
>
> See [PR Submission Guidelines](../../quests/template.md) for complete details.
