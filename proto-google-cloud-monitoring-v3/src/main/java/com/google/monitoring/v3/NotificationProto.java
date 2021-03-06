/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification.proto

package com.google.monitoring.v3;

public final class NotificationProto {
  private NotificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannelDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/monitoring/v3/notification.prot"
          + "o\022\024google.monitoring.v3\032\026google/api/labe"
          + "l.proto\032!google/monitoring/v3/common.pro"
          + "to\032\036google/protobuf/wrappers.proto\"\323\001\n\035N"
          + "otificationChannelDescriptor\022\014\n\004name\030\006 \001"
          + "(\t\022\014\n\004type\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023"
          + "\n\013description\030\003 \001(\t\022+\n\006labels\030\004 \003(\0132\033.go"
          + "ogle.api.LabelDescriptor\022>\n\017supported_ti"
          + "ers\030\005 \003(\0162!.google.monitoring.v3.Service"
          + "TierB\002\030\001\"\266\004\n\023NotificationChannel\022\014\n\004type"
          + "\030\001 \001(\t\022\014\n\004name\030\006 \001(\t\022\024\n\014display_name\030\003 \001"
          + "(\t\022\023\n\013description\030\004 \001(\t\022E\n\006labels\030\005 \003(\0132"
          + "5.google.monitoring.v3.NotificationChann"
          + "el.LabelsEntry\022N\n\013user_labels\030\010 \003(\01329.go"
          + "ogle.monitoring.v3.NotificationChannel.U"
          + "serLabelsEntry\022Y\n\023verification_status\030\t "
          + "\001(\0162<.google.monitoring.v3.NotificationC"
          + "hannel.VerificationStatus\022+\n\007enabled\030\013 \001"
          + "(\0132\032.google.protobuf.BoolValue\032-\n\013Labels"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0321\n"
          + "\017UserLabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\"W\n\022VerificationStatus\022#\n\037VERIFI"
          + "CATION_STATUS_UNSPECIFIED\020\000\022\016\n\nUNVERIFIE"
          + "D\020\001\022\014\n\010VERIFIED\020\002B\251\001\n\030com.google.monitor"
          + "ing.v3B\021NotificationProtoP\001Z>google.gola"
          + "ng.org/genproto/googleapis/monitoring/v3"
          + ";monitoring\252\002\032Google.Cloud.Monitoring.V3"
          + "\312\002\032Google\\Cloud\\Monitoring\\V3b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.LabelProto.getDescriptor(),
          com.google.monitoring.v3.CommonProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        },
        assigner);
    internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_NotificationChannelDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor,
            new java.lang.String[] {
              "Name", "Type", "DisplayName", "Description", "Labels", "SupportedTiers",
            });
    internal_static_google_monitoring_v3_NotificationChannel_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_NotificationChannel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannel_descriptor,
            new java.lang.String[] {
              "Type",
              "Name",
              "DisplayName",
              "Description",
              "Labels",
              "UserLabels",
              "VerificationStatus",
              "Enabled",
            });
    internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor =
        internal_static_google_monitoring_v3_NotificationChannel_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_NotificationChannel_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.api.LabelProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
