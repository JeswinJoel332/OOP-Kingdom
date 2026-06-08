# ⚔️ Week 01 Quest: The Foundation

The kingdom requires its foundational structures to support the growing population.

## Available Entities

| Entity | Contract | Status |
|--------|----------|--------|
| **Lumberyard** | `AbstractLumberyard` | ✅ Built — see [`Lumberyard.java`](../kingdom/src/main/java/kingdom/entities/Lumberyard.java) |
| **Market** | [`AbstractMarket`](../kingdom/src/main/java/kingdom/contracts/AbstractMarket.java) | ✅ Built by @higorv10 — see [`Market.java`](../kingdom/src/main/java/kingdom/entities/Market.java) |
| **Barracks** | [`AbstractBarracks`](../kingdom/src/main/java/kingdom/contracts/AbstractBarracks.java) | ⚔️ Quest open — [#3](https://github.com/Hemanthkumar2k04/OOP-Kingdom/issues/3) |
| **Blacksmith** | [`AbstractBlacksmith`](../kingdom/src/main/java/kingdom/contracts/AbstractBlacksmith.java) | ⚔️ Quest open — [#4](https://github.com/Hemanthkumar2k04/OOP-Kingdom/issues/4) |
| **Hospital** | [`AbstractHospital`](../kingdom/src/main/java/kingdom/contracts/AbstractHospital.java) | ⚔️ Quest open — [#8](https://github.com/Hemanthkumar2k04/OOP-Kingdom/issues/8) |
| **Library** | [`AbstractLibrary`](../kingdom/src/main/java/kingdom/contracts/AbstractLibrary.java) | ⚔️ Quest open — [#9](https://github.com/Hemanthkumar2k04/OOP-Kingdom/issues/9) |
| **Tavern** | [`AbstractTavern`](../kingdom/src/main/java/kingdom/contracts/AbstractTavern.java) | ⚔️ Quest open — [#10](https://github.com/Hemanthkumar2k04/OOP-Kingdom/issues/10) |

---

## Instructions

1. **Pick an entity** — Barracks, Blacksmith, Hospital, Library, or Tavern (Lumberyard and Market are done as references)
2. **Read the contract** — open the corresponding abstract class in `kingdom/contracts/`
3. **Implement the class** in `kingdom/entities/` — extend the contract, implement all methods, add `@JsonProperty`, register with `KingdomRegistry`
4. **Write tests** in `kingdom/src/test/java/kingdom/entities/` — constructor, contract methods, extra methods, Jackson serialization
5. **Test locally:**
   ```bash
   cd kingdom
   mvn clean test
   ```
6. **Boot check:**
   ```bash
   cd kingdom
   mvn exec:java -Dexec.mainClass="kingdom.Main"
   ```
7. **Update [`contributors.json`](../contributors.json):** `"YourClass": "YourGitHubUsername"`
8. **Create a UML diagram** (optional — save in `uml/yourclass.md`, include only directly related classes, earns bonus points during review)
9. **Submit a PR** using the [PR Template](../.github/PULL_REQUEST_TEMPLATE.md)

> **Note:** No pre-booking — multiple contributors can implement the same entity. The best design wins the merge.

---

## 📚 Reference

| Doc | Link |
|-----|------|
| Code Standards | [CODE_STANDARDS.md](../docs/CODE_STANDARDS.md) |
| Build & Test | [BUILD.md](../docs/BUILD.md) |
| Review Rubric | [REVIEW_RUBRIC.md](../docs/REVIEW_RUBRIC.md) |
| Quest Guide | [template.md](../quests/template.md) |
| Contributing Guide | [CONTRIBUTING.md](../.github/CONTRIBUTING.md) |

---

_May the best design win. ⚔️_