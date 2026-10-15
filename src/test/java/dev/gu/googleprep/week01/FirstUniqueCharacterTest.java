package dev.gu.googleprep.week01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.OptionalInt;
import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {
    @Test void findsFirstUnique() {
        assertEquals(OptionalInt.of('c'), FirstUniqueCharacter.firstUniqueCodePoint("aabbcdde"));
    }

    @Test void returnsEmptyWhenNoUnique() {
        assertEquals(OptionalInt.empty(), FirstUniqueCharacter.firstUniqueCodePoint("aabb"));
    }

    @Test void handlesEmptyString() {
        assertEquals(OptionalInt.empty(), FirstUniqueCharacter.firstUniqueCodePoint(""));
    }

    @Test void isCaseSensitive() {
        assertEquals(OptionalInt.of('a'), FirstUniqueCharacter.firstUniqueCodePoint("aA"));
    }

    @Disabled("Bônus: remova @Disabled quando chegar à parte Unicode")
    @Test void handlesUnicodeCodePoints() {
        assertEquals(OptionalInt.of(0x1F643), FirstUniqueCharacter.firstUniqueCodePoint("🙂🙃🙂"));
    }
}
