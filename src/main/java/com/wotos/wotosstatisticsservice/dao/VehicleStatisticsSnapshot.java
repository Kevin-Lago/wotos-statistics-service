package com.wotos.wotosstatisticsservice.dao;

import javax.persistence.*;


@Entity
@Table(name = "vehicle_statistics_snapshots")
public class VehicleStatisticsSnapshot {
    @Id
    @GeneratedValue
    @Column(name = "vehicle_statistics_snapshot_id")
    private Integer vehicleStatisticsSnapshotId;
    @Column(name = "account_id", nullable = false)
    private Integer accountId;
    @Column(name = "vehicle_id", nullable = false)
    private Integer vehicleId;
    @Column(name = "game_mode", nullable = false)
    private String gameMode;
    @Column(name = "create_timestamp", nullable = false)
    private Long createTimestamp;
    @Column(name = "total_battles", nullable = false)
    private Integer totalBattles;
    @Column(name = "survived_battles", nullable = false)
    private Integer survivedBattles;
    @Column(name = "kill_death_ratio", nullable = false)
    private Float killDeathRatio;
    @Column(name = "hit_miss_ratio", nullable = false)
    private Float hitMissRatio;
    @Column(name = "win_loss_ratio", nullable = false)
    private Float winLossRatio;
    @Column(name = "average_wn8", nullable = false)
    private Float averageWn8;
    @Column(name = "average_experience", nullable = false)
    private Float averageExperience;
    @Column(name = "average_damage", nullable = false)
    private Float averageDamage;
    @Column(name = "average_kills", nullable = false)
    private Float averageKills;
    @Column(name = "average_damage_received", nullable = false)
    private Float averageDamageReceived;
    @Column(name = "average_shots", nullable = false)
    private Float averageShots;
    @Column(name = "average_stun_assisted_damage", nullable = false)
    private Float averageStunAssistedDamage;
    @Column(name = "average_capture_points", nullable = false)
    private Float averageCapturePoints;
    @Column(name = "dropped_capture_points", nullable = false)
    private Float averageDroppedCapturePoints;
    @Column(name = "average_spotting", nullable = false)
    private Float averageSpotting;

    public Integer getVehicleStatisticsSnapshotId() {
        return vehicleStatisticsSnapshotId;
    }

    public void setVehicleStatisticsSnapshotId(Integer vehicleStatisticsSnapshotId) {
        this.vehicleStatisticsSnapshotId = vehicleStatisticsSnapshotId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Integer getTotalBattles() {
        return totalBattles;
    }

    public void setTotalBattles(Integer totalBattles) {
        this.totalBattles = totalBattles;
    }

    public Integer getSurvivedBattles() {
        return survivedBattles;
    }

    public void setSurvivedBattles(Integer survivedBattles) {
        this.survivedBattles = survivedBattles;
    }

    public Float getKillDeathRatio() {
        return killDeathRatio;
    }

    public void setKillDeathRatio(Float killDeathRatio) {
        this.killDeathRatio = killDeathRatio;
    }

    public Float getHitMissRatio() {
        return hitMissRatio;
    }

    public void setHitMissRatio(Float hitMissRatio) {
        this.hitMissRatio = hitMissRatio;
    }

    public Float getWinLossRatio() {
        return winLossRatio;
    }

    public void setWinLossRatio(Float winLossRatio) {
        this.winLossRatio = winLossRatio;
    }

    public Float getAverageWn8() {
        return averageWn8;
    }

    public void setAverageWn8(Float averageWn8) {
        this.averageWn8 = averageWn8;
    }

    public Float getAverageExperience() {
        return averageExperience;
    }

    public void setAverageExperience(Float averageExperience) {
        this.averageExperience = averageExperience;
    }

    public Float getAverageDamage() {
        return averageDamage;
    }

    public void setAverageDamage(Float averageDamage) {
        this.averageDamage = averageDamage;
    }

    public Float getAverageKills() {
        return averageKills;
    }

    public void setAverageKills(Float averageKills) {
        this.averageKills = averageKills;
    }

    public Float getAverageDamageReceived() {
        return averageDamageReceived;
    }

    public void setAverageDamageReceived(Float averageDamageReceived) {
        this.averageDamageReceived = averageDamageReceived;
    }

    public Float getAverageShots() {
        return averageShots;
    }

    public void setAverageShots(Float averageShots) {
        this.averageShots = averageShots;
    }

    public Float getAverageStunAssistedDamage() {
        return averageStunAssistedDamage;
    }

    public void setAverageStunAssistedDamage(Float averageStunAssistedDamage) {
        this.averageStunAssistedDamage = averageStunAssistedDamage;
    }

    public Float getAverageCapturePoints() {
        return averageCapturePoints;
    }

    public void setAverageCapturePoints(Float averageCapturePoints) {
        this.averageCapturePoints = averageCapturePoints;
    }

    public Float getAverageDroppedCapturePoints() {
        return averageDroppedCapturePoints;
    }

    public void setAverageDroppedCapturePoints(Float averageDroppedCapturePoints) {
        this.averageDroppedCapturePoints = averageDroppedCapturePoints;
    }

    public Float getAverageSpotting() {
        return averageSpotting;
    }

    public void setAverageSpotting(Float averageSpotting) {
        this.averageSpotting = averageSpotting;
    }
}
