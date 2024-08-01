package com.benidict.network.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J}\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\t\u00101\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016\u00a8\u00063"}, d2 = {"Lcom/benidict/network/model/BreedDTO;", "", "id", "", "name", "", "image", "Lcom/benidict/network/model/ImageDTO;", "weight", "Lcom/benidict/network/model/MeasurementDTO;", "height", "bredFor", "breedGroup", "lifeSpan", "temperament", "origin", "referenceImageId", "(ILjava/lang/String;Lcom/benidict/network/model/ImageDTO;Lcom/benidict/network/model/MeasurementDTO;Lcom/benidict/network/model/MeasurementDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBredFor", "()Ljava/lang/String;", "getBreedGroup", "getHeight", "()Lcom/benidict/network/model/MeasurementDTO;", "getId", "()I", "getImage", "()Lcom/benidict/network/model/ImageDTO;", "getLifeSpan", "getName", "getOrigin", "getReferenceImageId", "getTemperament", "getWeight", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "network_debug"})
public final class BreedDTO {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "image")
    private final com.benidict.network.model.ImageDTO image = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "weight")
    private final com.benidict.network.model.MeasurementDTO weight = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "height")
    private final com.benidict.network.model.MeasurementDTO height = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "bred_for")
    private final java.lang.String bredFor = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "breed_group")
    private final java.lang.String breedGroup = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "life_span")
    private final java.lang.String lifeSpan = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "temperament")
    private final java.lang.String temperament = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "origin")
    private final java.lang.String origin = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "reference_image_id")
    private final java.lang.String referenceImageId = null;
    @org.jetbrains.annotations.NotNull
    public static final com.benidict.network.model.BreedDTO.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.benidict.network.model.BreedDTO copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    com.benidict.network.model.ImageDTO image, @org.jetbrains.annotations.Nullable
    com.benidict.network.model.MeasurementDTO weight, @org.jetbrains.annotations.Nullable
    com.benidict.network.model.MeasurementDTO height, @org.jetbrains.annotations.NotNull
    java.lang.String bredFor, @org.jetbrains.annotations.NotNull
    java.lang.String breedGroup, @org.jetbrains.annotations.NotNull
    java.lang.String lifeSpan, @org.jetbrains.annotations.NotNull
    java.lang.String temperament, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String referenceImageId) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public BreedDTO() {
        super();
    }
    
    public BreedDTO(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    com.benidict.network.model.ImageDTO image, @org.jetbrains.annotations.Nullable
    com.benidict.network.model.MeasurementDTO weight, @org.jetbrains.annotations.Nullable
    com.benidict.network.model.MeasurementDTO height, @org.jetbrains.annotations.NotNull
    java.lang.String bredFor, @org.jetbrains.annotations.NotNull
    java.lang.String breedGroup, @org.jetbrains.annotations.NotNull
    java.lang.String lifeSpan, @org.jetbrains.annotations.NotNull
    java.lang.String temperament, @org.jetbrains.annotations.NotNull
    java.lang.String origin, @org.jetbrains.annotations.NotNull
    java.lang.String referenceImageId) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.benidict.network.model.ImageDTO component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.benidict.network.model.ImageDTO getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.benidict.network.model.MeasurementDTO component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.benidict.network.model.MeasurementDTO getWeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.benidict.network.model.MeasurementDTO component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.benidict.network.model.MeasurementDTO getHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBredFor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBreedGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLifeSpan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTemperament() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrigin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReferenceImageId() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007\u00a8\u0006\b"}, d2 = {"Lcom/benidict/network/model/BreedDTO$Companion;", "", "()V", "toDomain", "Lcom/benidict/domain/model/Breed;", "breedDTO", "Lcom/benidict/network/model/BreedDTO;", "", "network_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.benidict.domain.model.Breed toDomain(@org.jetbrains.annotations.NotNull
        com.benidict.network.model.BreedDTO breedDTO) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.benidict.domain.model.Breed> toDomain(@org.jetbrains.annotations.NotNull
        java.util.List<com.benidict.network.model.BreedDTO> breedDTO) {
            return null;
        }
    }
}