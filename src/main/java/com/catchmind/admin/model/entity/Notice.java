package com.catchmind.admin.model.entity;

import com.catchmind.admin.model.config.AuditableUpdate;
import com.catchmind.admin.model.config.BaseEntityUpdate;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Notice extends BaseEntityUpdate implements AuditableUpdate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noIdx;
    private String noTitle;
    private String adName;
    private String adUserid;
    private String noContent;

}
