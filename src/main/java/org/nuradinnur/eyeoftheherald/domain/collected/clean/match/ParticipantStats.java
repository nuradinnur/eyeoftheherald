package org.nuradinnur.eyeoftheherald.domain.collected.clean.match;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.List;

@Data
@Entity
@IdClass(ParticipantStatsId.class)
class ParticipantStats {
    @Id
    private Long gameId;
    @Id
    private Integer participantId;
    private Boolean isWin;
    private Integer championLevel;
    private Integer kills;
    private Integer deaths;
    private Integer assists;
    private Integer primaryRuneTree;
    private Integer secondaryRuneTree;
    private List<Integer> runeIds;
    private List<Integer> statRuneIds;
    private List<Integer> rune1Performance;
    private List<Integer> rune2Performance;
    private List<Integer> rune3Performance;
    private List<Integer> rune4Performance;
    private List<Integer> rune5Performance;
    private List<Integer> rune6Performance;
    private List<Integer> items;
    private Integer goldEarned;
    private Integer goldSpent;
    private Integer doubleKills;
    private Integer tripleKills;
    private Integer quadraKills;
    private Integer pentaKills;
    private Integer legendaryKills;
    private Integer largestMultiKill;
    private Integer killingSprees;
    private Integer largestKillingSpree;
    private Boolean hasFirstBloodAssist;
    private Boolean hasFirstBloodKill;
    private Boolean hasFirstTowerAssist;
    private Boolean hasFirstTowerKill;
    private Boolean hasFirstInhibitorKill;
    private Boolean hasFirstInhibitorAssist;
    private Integer towerKills;
    private Integer inhibitorKills;
    private Long damageDealtToTowers;
    private Long damageDealtToObjectives;
    private Integer largestCriticalStrike;
    private Long physicalDamageDealtToChampions;
    private Long physicalDamageDealt;
    private Long physicalDamageTaken;
    private Long magicDamageDealtToChampions;
    private Long magicDamageDealt;
    private Long magicalDamageTaken;
    private Long trueDamageDealtToChampions;
    private Long trueDamageDealt;
    private Long trueDamageTaken;
    private Long totalDamageDealtToChampions;
    private Long totalDamageDealt;
    private Long totalDamageTaken;
    private Long damageSelfMitigated;
    private Integer longestTimeSpentLiving;
    private Integer totalTimeCrowdControlDealt;
    private Long crowdControlEffectivenessScore;
    private Long totalHealthHealed;
    private Integer totalUnitsHealed;
    private Integer totalMinionsKilled;
    private Integer neutralMinionsKilled;
    private Integer neutralMinionsKilledEnemyJungle;
    private Integer neutralMinionsKilledTeamJungle;
    private Long visionScore;
    private Integer wardsPlaced;
    private Integer wardsKilled;
    private Integer stealthWardsBought;
    private Integer controlWardsBought;
    private List<Integer> playerScores;
    private Integer combatPlayerScore;
    private Integer objectivePlayerScore;
    private Integer totalPlayerScore;
    private Integer totalScoreRank;
    private Integer teamObjective;
    private Integer nodeNeutralizeAssist;
    private Integer nodeNeutralize;
    private Integer nodeCaptureAssist;
    private Integer nodeCapture;
    private Integer altarsNeutralized;
    private Integer altarsCaptured;
}
