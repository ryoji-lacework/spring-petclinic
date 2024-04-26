{
  "SchemaVersion": 2,
  "Metadata": {
    "Id": "78caa06c-7ee4-4b75-aa6c-95188c0b1b13",
    "InputKind": "repository",
    "InputLocation": "/Users/ryobet/lw/spring-petclinic",
    "InputOrigin": "Ryojis-MacBook-Pro.local",
    "CustomProperties": {
      "deployment": "local",
      "version": "0.0.99"
    },
    "Platform": {
      "architecture": "arm64",
      "os": "darwin",
      "os.version": "14.4",
      "variant": "v8"
    },
    "Created": "2024-03-18T15:05:59.90071-04:00"
  },
  "RootArtifactId": "46bda108-a6b4-43f5-a2c6-6e37ff9b9615",
  "Artifacts": [
    {
      "Id": "46bda108-a6b4-43f5-a2c6-6e37ff9b9615",
      "Name": "https://github.com/ryoji-lacework/spring-petclinic.git",
      "Path": "https://github.com/ryoji-lacework/spring-petclinic.git",
      "Type": "repo",
      "Class": "collection",
      "Language": "none",
      "Repository": "dad5098a-8f30-47aa-a4b3-cbebe04346f9",
      "Compare": {
        "Hash": "4631631fa062b9614a4751cca62535bea20448c5"
      },
      "LinesOfCode": {
        "java": 1496,
        "nodejs": 1092
      },
      "Children": [
        {
          "ArtifactId": "4d0240b8-1795-4e83-9e19-aa37f59a2eb0"
        }
      ]
    },
    {
      "Id": "4d0240b8-1795-4e83-9e19-aa37f59a2eb0",
      "Name": "spring-petclinic",
      "Path": "pom.xml",
      "Type": "pom",
      "Class": "source",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9857513
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9001297
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.0-SNAPSHOT"
      },
      "Repository": "dad5098a-8f30-47aa-a4b3-cbebe04346f9",
      "LastEdit": "37544b5d-ada4-4e7b-86d2-cfb5729cdd4e",
      "Compare": {
        "Hash": "5e6090e8776d2397b9ff41f53b0f8c0ab90bb834"
      },
      "Files": [
        ".mvn/wrapper/MavenWrapperDownloader.java",
        "src/main/java/org/springframework/samples/petclinic/PetClinicApplication.java",
        "src/main/java/org/springframework/samples/petclinic/model/BaseEntity.java",
        "src/main/java/org/springframework/samples/petclinic/model/NamedEntity.java",
        "src/main/java/org/springframework/samples/petclinic/model/Person.java",
        "src/main/java/org/springframework/samples/petclinic/model/package-info.java",
        "src/main/java/org/springframework/samples/petclinic/owner/Owner.java",
        "src/main/java/org/springframework/samples/petclinic/owner/OwnerController.java",
        "src/main/java/org/springframework/samples/petclinic/owner/OwnerRepository.java",
        "src/main/java/org/springframework/samples/petclinic/owner/Pet.java",
        "src/main/java/org/springframework/samples/petclinic/owner/PetController.java",
        "src/main/java/org/springframework/samples/petclinic/owner/PetType.java",
        "src/main/java/org/springframework/samples/petclinic/owner/PetTypeFormatter.java",
        "src/main/java/org/springframework/samples/petclinic/owner/PetValidator.java",
        "src/main/java/org/springframework/samples/petclinic/owner/Visit.java",
        "src/main/java/org/springframework/samples/petclinic/owner/VisitController.java",
        "src/main/java/org/springframework/samples/petclinic/system/CacheConfiguration.java",
        "src/main/java/org/springframework/samples/petclinic/system/CrashController.java",
        "src/main/java/org/springframework/samples/petclinic/system/WelcomeController.java",
        "src/main/java/org/springframework/samples/petclinic/vet/Specialty.java",
        "src/main/java/org/springframework/samples/petclinic/vet/Vet.java",
        "src/main/java/org/springframework/samples/petclinic/vet/VetController.java",
        "src/main/java/org/springframework/samples/petclinic/vet/VetRepository.java",
        "src/main/java/org/springframework/samples/petclinic/vet/Vets.java",
        "src/test/java/org/springframework/samples/petclinic/PetClinicIntegrationTests.java",
        "src/test/java/org/springframework/samples/petclinic/model/ValidatorTests.java",
        "src/test/java/org/springframework/samples/petclinic/owner/OwnerControllerTests.java",
        "src/test/java/org/springframework/samples/petclinic/owner/PetControllerTests.java",
        "src/test/java/org/springframework/samples/petclinic/owner/PetTypeFormatterTests.java",
        "src/test/java/org/springframework/samples/petclinic/owner/VisitControllerTests.java",
        "src/test/java/org/springframework/samples/petclinic/service/ClinicServiceTests.java",
        "src/test/java/org/springframework/samples/petclinic/service/EntityUtils.java",
        "src/test/java/org/springframework/samples/petclinic/system/CrashControllerTests.java",
        "src/test/java/org/springframework/samples/petclinic/vet/VetControllerTests.java",
        "src/test/java/org/springframework/samples/petclinic/vet/VetTests.java"
      ],
      "Children": [
        {
          "ArtifactId": "d5d5dd6e-c22c-48e4-bbb3-308c8c8474eb",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/hibernate/hibernate-core/5.6.9.Final/hibernate-core-5.6.9.Final.pom",
              "Start": 77,
              "End": 88
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "143cae9d-a474-4f5a-aba3-1d6f170bfa82",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.7.1/spring-boot-starter-logging-2.7.1.pom",
              "Start": 44,
              "End": 49
            }
          ],
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "8a7c2688-0814-49eb-8e2d-475548ff8154",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/ch/qos/logback/logback-classic/1.2.11/logback-classic-1.2.11.pom",
              "Start": 20,
              "End": 24
            }
          ],
          "PathInfo": {
            "MinDepth": 6
          }
        },
        {
          "ArtifactId": "36829d25-984d-4212-949a-81a4ac1a51eb",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.13.3/jackson-databind-2.13.3.pom",
              "Start": 61,
              "End": 69
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "dc6605ae-7436-48b8-87b9-ad6492006dfe",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/webjars/webjars-locator-core/0.50/webjars-locator-core-0.50.pom",
              "Start": 71,
              "End": 75
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "11c20fe7-0461-4940-b213-fb9fe3e63ddf",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/cloud/spring-cloud-function-adapter-aws/1.0.2.RELEASE/spring-cloud-function-adapter-aws-1.0.2.RELEASE.pom",
              "Start": 113,
              "End": 118
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "09351429-43da-4f88-ab31-b542350b491e",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-json/2.7.1/spring-boot-starter-json-2.7.1.pom",
              "Start": 62,
              "End": 67
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "c3a566c8-681d-4d5f-a6b3-30242151b530",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/2.7.1/spring-boot-actuator-autoconfigure-2.7.1.pom",
              "Start": 68,
              "End": 73
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "79c7a047-c175-4644-88cb-9527902e1fe4",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-json/2.7.1/spring-boot-starter-json-2.7.1.pom",
              "Start": 74,
              "End": 79
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "c120954f-944e-4bcb-a220-916d45beadb4",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/hibernate/hibernate-core/5.6.9.Final/hibernate-core-5.6.9.Final.pom",
              "Start": 113,
              "End": 124
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "fc3e2bbe-f17e-44a8-a727-16c745163862",
          "Lines": [
            {
              "Start": 85,
              "End": 89
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "509eae90-4d48-4328-b0a3-ec66c0e15ab2",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "fd925e92-4e22-488f-ae76-32d9c1ba6ca1",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/glassfish/jaxb/jaxb-runtime/2.3.6/jaxb-runtime-2.3.6.pom",
              "Start": 77,
              "End": 81
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "643dfcfd-e6cc-4132-8fd4-c9fc6fcc9480",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/glassfish/jaxb/jaxb-runtime/2.3.6/jaxb-runtime-2.3.6.pom",
              "Start": 61,
              "End": 64
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "4209f509-6aac-46c7-986e-6ad68491aae5",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/2.7.1/spring-boot-starter-jdbc-2.7.1.pom",
              "Start": 50,
              "End": 55
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "cc8e30b5-f548-4912-953e-a95981a24d62",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/webjars/webjars-locator-core/0.50/webjars-locator-core-0.50.pom",
              "Start": 66,
              "End": 70
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "a39bf978-8db3-4b32-942c-dec78a0ee043",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-actuator/2.7.1/spring-boot-starter-actuator-2.7.1.pom",
              "Start": 56,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "4bb88072-f6f0-4296-b04f-d9448a92d927",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/cloud/spring-cloud-function-adapter-aws/1.0.2.RELEASE/spring-cloud-function-adapter-aws-1.0.2.RELEASE.pom",
              "Start": 163,
              "End": 168
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "023381b2-15a5-4c61-ba10-6f440b5c651d",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/jakarta/xml/bind/jakarta.xml.bind-api/2.3.3/jakarta.xml.bind-api-2.3.3.pom",
              "Start": 33,
              "End": 36
            }
          ],
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "15fde248-9fc1-4046-8fb4-bdfcff77ab44",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter/2.7.1/spring-boot-starter-2.7.1.pom",
              "Start": 62,
              "End": 67
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "5d4d803c-6f1b-46ff-be51-c3ab0252a967",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.7.1/spring-boot-starter-data-jpa-2.7.1.pom",
              "Start": 62,
              "End": 67
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "af136547-6d17-4afd-bec9-5bd9706ea68e",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.7.1/spring-boot-starter-data-jpa-2.7.1.pom",
              "Start": 56,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "542d3822-5b3b-43be-8f4a-a8b4039fab48",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/hibernate/validator/hibernate-validator/6.2.3.Final/hibernate-validator-6.2.3.Final.pom",
              "Start": 39,
              "End": 42
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "6df1206e-5144-49b9-88d9-a3d515571f00",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/glassfish/jaxb/jaxb-runtime/2.3.6/jaxb-runtime-2.3.6.pom",
              "Start": 47,
              "End": 50
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "5853f0a0-5d49-43e0-a2f0-2099a757b909",
          "Lines": [
            {
              "Start": 102,
              "End": 105
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "6ada244c-d5ec-4915-80a6-7888a84b9036",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "1d06e6c7-d1fe-42dd-861d-3ca04b515b04",
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "f33a544b-b0a2-47f1-bd28-e543ffb64bf9",
          "Lines": [
            {
              "Start": 90,
              "End": 94
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "73879309-065c-4906-bd85-c44495ae28f1",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "085e2ef3-2d6e-4dd3-9036-40fde43ff2ee",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/mockito/mockito-core/4.5.1/mockito-core-4.5.1.pom",
              "Start": 70,
              "End": 75
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "e46128b0-4948-4d0a-9c43-e3b8be1973e7",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/mockito/mockito-core/4.5.1/mockito-core-4.5.1.pom",
              "Start": 64,
              "End": 69
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "15849b7c-eed9-44ad-aff1-40c3d91a138f",
          "Lines": [
            {
              "Start": 34,
              "End": 38
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "3082a8c0-ea3d-491e-8516-649dfdc04e30",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "285a3fbc-4152-42b6-8b12-c2320096fabd",
          "Lines": [
            {
              "Start": 39,
              "End": 43
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "37544b5d-ada4-4e7b-86d2-cfb5729cdd4e",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "772dfd3a-cdc9-40b2-a9a7-710d7d216d70",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.7.1/spring-boot-starter-logging-2.7.1.pom",
              "Start": 50,
              "End": 55
            }
          ],
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "dd8ba96c-d491-462c-851c-74f6910986bd",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.7.1/spring-boot-starter-tomcat-2.7.1.pom",
              "Start": 50,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "225a32a2-1a2c-49d9-96f7-c43b7b863e84",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.7.1/spring-boot-starter-validation-2.7.1.pom",
              "Start": 50,
              "End": 55
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "9efff58d-7064-457b-9157-b6eb91ed0f63",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.7.1/spring-boot-starter-tomcat-2.7.1.pom",
              "Start": 68,
              "End": 79
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "46c85ad8-388b-4860-9fc7-edc8e085dbbe",
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "b8156a56-6c1d-4b16-81f6-0a097715178a",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.7.1/spring-boot-starter-aop-2.7.1.pom",
              "Start": 56,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "ecfb238d-8551-4aae-b063-2d3c74f8d748",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/apache/logging/log4j/log4j-api/2.15.0/log4j-api-2.15.0.pom",
              "Start": 70,
              "End": 73
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "a7b033eb-2595-42f1-81b4-164cb4861190",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/thymeleaf/thymeleaf/3.0.15.RELEASE/thymeleaf-3.0.15.RELEASE.pom",
              "Start": 328,
              "End": 333
            }
          ],
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "a6c125e0-14f3-44e5-9409-a4b6d7753c15",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/postgresql/postgresql/42.3.6/postgresql-42.3.6.pom",
              "Start": 68,
              "End": 73
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "3db9823b-661e-4452-b677-7aae1f7a84e4",
          "Lines": [
            {
              "Start": 106,
              "End": 109
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "6ada244c-d5ec-4915-80a6-7888a84b9036",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "3f680088-5456-4d87-8c9b-f05f4a710694",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/ehcache/ehcache/3.10.0/ehcache-3.10.0.pom",
              "Start": 57,
              "End": 62
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "94291f95-6b94-4757-a0bd-26874780edf2",
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "eb02650d-a09c-42f3-af27-e3c79085881d",
          "PathInfo": {
            "MinDepth": 6
          }
        },
        {
          "ArtifactId": "d53bb8cc-1d0d-493f-8247-26048c7174ee",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/hibernate/hibernate-core/5.6.9.Final/hibernate-core-5.6.9.Final.pom",
              "Start": 137,
              "End": 148
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "0d982db2-e530-47c7-b570-a2c75665e5c2",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.7.1/spring-boot-starter-validation-2.7.1.pom",
              "Start": 56,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "d2f14d32-8dd3-42a9-867f-2fae8143d5b6",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.7.1/spring-boot-starter-data-jpa-2.7.1.pom",
              "Start": 68,
              "End": 91
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "532dd5ce-10ce-4079-aaf8-798ec66eddd0",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/hibernate/hibernate-core/5.6.9.Final/hibernate-core-5.6.9.Final.pom",
              "Start": 41,
              "End": 52
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "aa49ef94-2ad9-4111-8196-bb457b438abd",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/hibernate/hibernate-core/5.6.9.Final/hibernate-core-5.6.9.Final.pom",
              "Start": 101,
              "End": 112
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "7e36dce9-cdc4-4f13-9205-87f3e5c00a7e",
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "c12605b1-80ea-4942-a5e2-37c5a3eaec75",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/apache/logging/log4j/log4j-api/2.15.0/log4j-api-2.15.0.pom",
              "Start": 66,
              "End": 69
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "350fe3f6-92b4-4b17-bf7c-981f86ab474c",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/apache/logging/log4j/log4j-api/2.15.0/log4j-api-2.15.0.pom",
              "Start": 58,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "1de4e584-d07b-493f-b42a-37ecb13bd3fc",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/apache/logging/log4j/log4j-api/2.15.0/log4j-api-2.15.0.pom",
              "Start": 62,
              "End": 65
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "a817d227-45f8-4acd-a71f-a92df80d2f35",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/junit/platform/junit-platform-engine/1.8.2/junit-platform-engine-1.8.2.pom",
              "Start": 82,
              "End": 87
            }
          ],
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "526c3bc7-a265-415c-8ead-13d0a2bb5dfb",
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "2bc09d19-1c36-48b9-a9ae-95a2cbeee327",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/apache/logging/log4j/log4j-api/2.15.0/log4j-api-2.15.0.pom",
              "Start": 54,
              "End": 57
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "3ae5fbac-de00-4ef3-9f0a-39543fbcb049",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/io/micrometer/micrometer-core/1.9.1/micrometer-core-1.9.1.pom",
              "Start": 34,
              "End": 45
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "d2db5848-12b5-4090-9283-ed79f0404727",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/apache/logging/log4j/log4j-core/2.15.0/log4j-core-2.15.0.pom",
              "Start": 209,
              "End": 212
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "1f50e9ef-b06d-412a-8c2a-390688b5294e",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/apache/logging/log4j/log4j-core/2.15.0/log4j-core-2.15.0.pom",
              "Start": 213,
              "End": 216
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "10d8e534-12b3-4a5c-a8be-560ff0f74836",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/mockito/mockito-core/4.5.1/mockito-core-4.5.1.pom",
              "Start": 76,
              "End": 81
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "eeb1c59e-cc62-4c25-8ac4-6258f33df837",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/junit/platform/junit-platform-engine/1.8.2/junit-platform-engine-1.8.2.pom",
              "Start": 76,
              "End": 81
            }
          ],
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "9b96826a-5676-43ea-81b5-c44dc3473643",
          "Lines": [
            {
              "Start": 95,
              "End": 99
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "73879309-065c-4906-bd85-c44495ae28f1",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "55ed1fcc-db27-413e-be3a-296ed6729c46",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/io/projectreactor/reactor-core/3.4.19/reactor-core-3.4.19.pom",
              "Start": 48,
              "End": 53
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "4f615bf0-d4dd-4b3b-bb4b-4046bb458f30",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.7.1/spring-boot-starter-logging-2.7.1.pom",
              "Start": 56,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "84980ad8-5d6c-495d-bc8d-9855929bcee8",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/ehcache/ehcache/3.10.0/ehcache-3.10.0.pom",
              "Start": 51,
              "End": 56
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "f738111f-5337-4ebb-a6d5-edde360ed125",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-actuator/2.7.1/spring-boot-starter-actuator-2.7.1.pom",
              "Start": 50,
              "End": 55
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "b86958fc-a002-41e4-a5f7-87ba612d910d",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/2.7.1/spring-boot-actuator-autoconfigure-2.7.1.pom",
              "Start": 44,
              "End": 49
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "900b929e-d6da-4913-aaf1-494a5eacc490",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/cloud/spring-cloud-function-context/1.0.2.RELEASE/spring-cloud-function-context-1.0.2.RELEASE.pom",
              "Start": 101,
              "End": 106
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "4a64b19d-a72e-4bb6-96eb-17ec24ed9ec1",
          "Lines": [
            {
              "Start": 54,
              "End": 57
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "6ee89cd0-3be8-4038-bae3-e8b6dd7c0569",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "221fa763-5fd0-451b-be96-6a857951c78b",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.7.1/spring-boot-starter-data-jpa-2.7.1.pom",
              "Start": 44,
              "End": 49
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "84fb57a5-bb13-4909-b3e6-1fe94c47b24d",
          "Lines": [
            {
              "Start": 58,
              "End": 61
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "6ee89cd0-3be8-4038-bae3-e8b6dd7c0569",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "e6b975be-b329-4476-98b4-06dfc31a8c96",
          "Lines": [
            {
              "Start": 62,
              "End": 65
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "6ee89cd0-3be8-4038-bae3-e8b6dd7c0569",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "06ed1187-8627-4711-9c1f-f05e7e32595e",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.7.1/spring-boot-starter-data-jpa-2.7.1.pom",
              "Start": 50,
              "End": 55
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "1d2faed0-42c1-46cd-804e-f62b57285d94",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-web/2.7.1/spring-boot-starter-web-2.7.1.pom",
              "Start": 50,
              "End": 55
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "485e81f5-29ba-47e7-97c5-2915181afbcd",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter/2.7.1/spring-boot-starter-2.7.1.pom",
              "Start": 56,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "7a75e814-9d3b-4368-8265-0c3bc62dff4e",
          "Lines": [
            {
              "Start": 74,
              "End": 77
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "6ee89cd0-3be8-4038-bae3-e8b6dd7c0569",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "deda5c80-1e4c-44ae-80e5-79cb3a6d2129",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-web/2.7.1/spring-boot-starter-web-2.7.1.pom",
              "Start": 56,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "f741f657-134f-4750-b8ca-106a1c03c027",
          "Lines": [
            {
              "Start": 70,
              "End": 73
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "ca511f68-34e0-486c-8c98-a5f33cfb921d",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "0091efcd-e66b-4e0f-8db4-32c1e4ff7ad8",
          "Lines": [
            {
              "Start": 66,
              "End": 69
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "ca511f68-34e0-486c-8c98-a5f33cfb921d",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "4c343774-29d0-4499-9ad6-0b259162f2f2",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/cloud/spring-cloud-function-adapter-aws/1.0.2.RELEASE/spring-cloud-function-adapter-aws-1.0.2.RELEASE.pom",
              "Start": 119,
              "End": 130
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "5ceb92d4-b375-4de3-a86a-8f8b3e73f4b7",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter/2.7.1/spring-boot-starter-2.7.1.pom",
              "Start": 44,
              "End": 49
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "6db742c5-4283-42d9-85bd-605d5cf9eba6",
          "Lines": [
            {
              "Start": 47,
              "End": 51
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "37544b5d-ada4-4e7b-86d2-cfb5729cdd4e",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "c0c8307b-06b4-4c37-b945-bf23ed885f69",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/cloud/spring-cloud-function-adapter-aws/1.0.2.RELEASE/spring-cloud-function-adapter-aws-1.0.2.RELEASE.pom",
              "Start": 101,
              "End": 106
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "09c2e4e0-ba53-4404-bc6c-4d062890555f",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/cloud/spring-cloud-function-context/1.0.2.RELEASE/spring-cloud-function-context-1.0.2.RELEASE.pom",
              "Start": 107,
              "End": 112
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "f8a4b2c8-1f9a-4f49-9d76-8136b13f46dd",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/data/spring-data-jpa/2.7.1/spring-data-jpa-2.7.1.pom",
              "Start": 182,
              "End": 186
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "51444558-075e-4248-9e48-222fa1a0f40b",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.7.1/spring-boot-starter-data-jpa-2.7.1.pom",
              "Start": 92,
              "End": 97
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "a659c713-7b3f-4faa-a991-7b01310a5987",
          "Tags": [
            "direct"
          ],
          "PathInfo": {
            "MinDepth": 1
          }
        },
        {
          "ArtifactId": "7c12feed-53d7-44fc-8cc5-02032816a355",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.7.1/spring-boot-starter-aop-2.7.1.pom",
              "Start": 50,
              "End": 55
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "ba201aee-84b7-4c18-80b0-2216596f4fb1",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.7.1/spring-boot-starter-data-jpa-2.7.1.pom",
              "Start": 98,
              "End": 103
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "7f339d64-f9b8-40a8-b3ba-a38816bea125",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/spring-web/5.3.21/spring-web-5.3.21.pom",
              "Start": 43,
              "End": 48
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "5fc4dd93-3a69-455e-a557-38175d2855c5",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-cache/2.7.1/spring-boot-starter-cache-2.7.1.pom",
              "Start": 50,
              "End": 55
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "cf7d5c64-dfa1-471f-8b57-ebe1ce7dddc0",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/spring-context-support/5.3.21/spring-context-support-5.3.21.pom",
              "Start": 49,
              "End": 54
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "efe99a55-b7eb-4bf5-8024-b82df10e68f2",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/spring-web/5.3.21/spring-web-5.3.21.pom",
              "Start": 49,
              "End": 54
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "b076eb9e-ae9c-4597-906a-8e6e8d901d10",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/spring-webmvc/5.3.21/spring-webmvc-5.3.21.pom",
              "Start": 67,
              "End": 72
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "f5a64733-8ad6-4908-9c1c-2d773e093df5",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/spring-core/5.3.21/spring-core-5.3.21.pom",
              "Start": 43,
              "End": 48
            }
          ],
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "5f9d138b-c974-4175-8273-7212ffa76497",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/2.7.1/spring-boot-starter-jdbc-2.7.1.pom",
              "Start": 56,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "4feaa549-fd7f-4d80-8a1b-04975799d281",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/cloud/spring-cloud-function-context/1.0.2.RELEASE/spring-cloud-function-context-1.0.2.RELEASE.pom",
              "Start": 113,
              "End": 118
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "8555539b-7bab-4d94-a966-b566c6c93207",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/data/spring-data-jpa/2.7.1/spring-data-jpa-2.7.1.pom",
              "Start": 188,
              "End": 191
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "a61f12d0-3314-4ddb-840f-b759a6b63bf7",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/data/spring-data-jpa/2.7.1/spring-data-jpa-2.7.1.pom",
              "Start": 203,
              "End": 206
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "384a7a6e-8e8b-49aa-866e-01ea758285e8",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/cloud/spring-cloud-function-adapter-aws/1.0.2.RELEASE/spring-cloud-function-adapter-aws-1.0.2.RELEASE.pom",
              "Start": 107,
              "End": 112
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "cb46010e-90db-4d8c-bf9a-1981dede1814",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-web/2.7.1/spring-boot-starter-web-2.7.1.pom",
              "Start": 68,
              "End": 73
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "10a5e18a-8255-4c1b-b79d-296430da8691",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-thymeleaf/2.7.1/spring-boot-starter-thymeleaf-2.7.1.pom",
              "Start": 56,
              "End": 61
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "743698bb-ecfe-425d-8737-39ac1a6070d2",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter-thymeleaf/2.7.1/spring-boot-starter-thymeleaf-2.7.1.pom",
              "Start": 50,
              "End": 55
            }
          ],
          "PathInfo": {
            "MinDepth": 3
          }
        },
        {
          "ArtifactId": "14def45f-5aed-49d4-8b6f-7e02fbec801f",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/thymeleaf/thymeleaf-spring5/3.0.15.RELEASE/thymeleaf-spring5-3.0.15.RELEASE.pom",
              "Start": 316,
              "End": 327
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        },
        {
          "ArtifactId": "cca005e7-cc94-4a34-bb20-778dcfe0443c",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/thymeleaf/thymeleaf/3.0.15.RELEASE/thymeleaf-3.0.15.RELEASE.pom",
              "Start": 335,
              "End": 340
            }
          ],
          "PathInfo": {
            "MinDepth": 5
          }
        },
        {
          "ArtifactId": "5aeac3b1-e877-46df-bc77-6ff8e901f65b",
          "Lines": [
            {
              "Start": 116,
              "End": 120
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "6c93fef0-7029-40f4-9e3b-2562a1ce31bd",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "4d9be696-162b-4b97-9e00-f99e47db6c15",
          "Lines": [
            {
              "Start": 121,
              "End": 125
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "c8a3b5b6-14a9-4c36-bd82-e3996011943c",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "9158bdc7-6dad-45fe-b4e4-c1dbec95c479",
          "Lines": [
            {
              "Start": 112,
              "End": 115
            }
          ],
          "Tags": [
            "direct"
          ],
          "LastEdit": "2a22a2d2-43d9-445c-95d8-36ad33fb5ca6",
          "PathInfo": {
            "MinDepth": 2
          }
        },
        {
          "ArtifactId": "5ca8c53c-ee09-4020-94e9-594658dcfa4d",
          "Lines": [
            {
              "RelativePath": "../../../.m2/repository/org/springframework/boot/spring-boot-starter/2.7.1/spring-boot-starter-2.7.1.pom",
              "Start": 74,
              "End": 79
            }
          ],
          "PathInfo": {
            "MinDepth": 4
          }
        }
      ],
      "Graph": [
        {
          "From": "4d0240b8-1795-4e83-9e19-aa37f59a2eb0",
          "To": [
            "a659c713-7b3f-4faa-a991-7b01310a5987"
          ]
        },
        {
          "From": "a659c713-7b3f-4faa-a991-7b01310a5987",
          "To": [
            "0091efcd-e66b-4e0f-8db4-32c1e4ff7ad8",
            "15849b7c-eed9-44ad-aff1-40c3d91a138f",
            "285a3fbc-4152-42b6-8b12-c2320096fabd",
            "3db9823b-661e-4452-b677-7aae1f7a84e4",
            "4a64b19d-a72e-4bb6-96eb-17ec24ed9ec1",
            "4d9be696-162b-4b97-9e00-f99e47db6c15",
            "5853f0a0-5d49-43e0-a2f0-2099a757b909",
            "5aeac3b1-e877-46df-bc77-6ff8e901f65b",
            "6db742c5-4283-42d9-85bd-605d5cf9eba6",
            "7a75e814-9d3b-4368-8265-0c3bc62dff4e",
            "84fb57a5-bb13-4909-b3e6-1fe94c47b24d",
            "9158bdc7-6dad-45fe-b4e4-c1dbec95c479",
            "9b96826a-5676-43ea-81b5-c44dc3473643",
            "e6b975be-b329-4476-98b4-06dfc31a8c96",
            "f33a544b-b0a2-47f1-bd28-e543ffb64bf9",
            "f741f657-134f-4750-b8ca-106a1c03c027",
            "fc3e2bbe-f17e-44a8-a727-16c745163862"
          ]
        },
        {
          "From": "0091efcd-e66b-4e0f-8db4-32c1e4ff7ad8",
          "To": [
            "1d2faed0-42c1-46cd-804e-f62b57285d94",
            "384a7a6e-8e8b-49aa-866e-01ea758285e8",
            "4c343774-29d0-4499-9ad6-0b259162f2f2",
            "cb46010e-90db-4d8c-bf9a-1981dede1814",
            "deda5c80-1e4c-44ae-80e5-79cb3a6d2129"
          ]
        },
        {
          "From": "15849b7c-eed9-44ad-aff1-40c3d91a138f",
          "To": [
            "1de4e584-d07b-493f-b42a-37ecb13bd3fc",
            "2bc09d19-1c36-48b9-a9ae-95a2cbeee327",
            "350fe3f6-92b4-4b17-bf7c-981f86ab474c",
            "c12605b1-80ea-4942-a5e2-37c5a3eaec75",
            "ecfb238d-8551-4aae-b063-2d3c74f8d748"
          ]
        },
        {
          "From": "285a3fbc-4152-42b6-8b12-c2320096fabd",
          "To": [
            "15849b7c-eed9-44ad-aff1-40c3d91a138f",
            "1de4e584-d07b-493f-b42a-37ecb13bd3fc",
            "1f50e9ef-b06d-412a-8c2a-390688b5294e",
            "2bc09d19-1c36-48b9-a9ae-95a2cbeee327",
            "c12605b1-80ea-4942-a5e2-37c5a3eaec75",
            "d2db5848-12b5-4090-9283-ed79f0404727"
          ]
        },
        {
          "From": "3db9823b-661e-4452-b677-7aae1f7a84e4",
          "To": [
            "3f680088-5456-4d87-8c9b-f05f4a710694",
            "5853f0a0-5d49-43e0-a2f0-2099a757b909",
            "84980ad8-5d6c-495d-bc8d-9855929bcee8"
          ]
        },
        {
          "From": "4a64b19d-a72e-4bb6-96eb-17ec24ed9ec1",
          "To": [
            "4c343774-29d0-4499-9ad6-0b259162f2f2",
            "a39bf978-8db3-4b32-942c-dec78a0ee043",
            "f738111f-5337-4ebb-a6d5-edde360ed125"
          ]
        },
        {
          "From": "6db742c5-4283-42d9-85bd-605d5cf9eba6",
          "To": [
            "11c20fe7-0461-4940-b213-fb9fe3e63ddf",
            "384a7a6e-8e8b-49aa-866e-01ea758285e8",
            "4bb88072-f6f0-4296-b04f-d9448a92d927",
            "4c343774-29d0-4499-9ad6-0b259162f2f2",
            "c0c8307b-06b4-4c37-b945-bf23ed885f69"
          ]
        },
        {
          "From": "7a75e814-9d3b-4368-8265-0c3bc62dff4e",
          "To": [
            "10a5e18a-8255-4c1b-b79d-296430da8691",
            "4c343774-29d0-4499-9ad6-0b259162f2f2",
            "743698bb-ecfe-425d-8737-39ac1a6070d2"
          ]
        },
        {
          "From": "84fb57a5-bb13-4909-b3e6-1fe94c47b24d",
          "To": [
            "4c343774-29d0-4499-9ad6-0b259162f2f2",
            "5fc4dd93-3a69-455e-a557-38175d2855c5"
          ]
        },
        {
          "From": "9158bdc7-6dad-45fe-b4e4-c1dbec95c479",
          "To": [
            "84980ad8-5d6c-495d-bc8d-9855929bcee8",
            "cc8e30b5-f548-4912-953e-a95981a24d62",
            "dc6605ae-7436-48b8-87b9-ad6492006dfe"
          ]
        },
        {
          "From": "9b96826a-5676-43ea-81b5-c44dc3473643",
          "To": [
            "a6c125e0-14f3-44e5-9409-a4b6d7753c15"
          ]
        },
        {
          "From": "e6b975be-b329-4476-98b4-06dfc31a8c96",
          "To": [
            "06ed1187-8627-4711-9c1f-f05e7e32595e",
            "221fa763-5fd0-451b-be96-6a857951c78b",
            "51444558-075e-4248-9e48-222fa1a0f40b",
            "5d4d803c-6f1b-46ff-be51-c3ab0252a967",
            "af136547-6d17-4afd-bec9-5bd9706ea68e",
            "ba201aee-84b7-4c18-80b0-2216596f4fb1",
            "d2f14d32-8dd3-42a9-867f-2fae8143d5b6"
          ]
        },
        {
          "From": "f741f657-134f-4750-b8ca-106a1c03c027",
          "To": [
            "0d982db2-e530-47c7-b570-a2c75665e5c2",
            "225a32a2-1a2c-49d9-96f7-c43b7b863e84",
            "4c343774-29d0-4499-9ad6-0b259162f2f2"
          ]
        },
        {
          "From": "06ed1187-8627-4711-9c1f-f05e7e32595e",
          "To": [
            "4209f509-6aac-46c7-986e-6ad68491aae5",
            "4c343774-29d0-4499-9ad6-0b259162f2f2",
            "5f9d138b-c974-4175-8273-7212ffa76497"
          ]
        },
        {
          "From": "0d982db2-e530-47c7-b570-a2c75665e5c2",
          "To": [
            "532dd5ce-10ce-4079-aaf8-798ec66eddd0",
            "542d3822-5b3b-43be-8f4a-a8b4039fab48",
            "c120954f-944e-4bcb-a220-916d45beadb4"
          ]
        },
        {
          "From": "10a5e18a-8255-4c1b-b79d-296430da8691",
          "To": [
            "14def45f-5aed-49d4-8b6f-7e02fbec801f",
            "84980ad8-5d6c-495d-bc8d-9855929bcee8"
          ]
        },
        {
          "From": "11c20fe7-0461-4940-b213-fb9fe3e63ddf",
          "To": [
            "36829d25-984d-4212-949a-81a4ac1a51eb",
            "dc6605ae-7436-48b8-87b9-ad6492006dfe"
          ]
        },
        {
          "From": "1d2faed0-42c1-46cd-804e-f62b57285d94",
          "To": [
            "09351429-43da-4f88-ab31-b542350b491e",
            "11c20fe7-0461-4940-b213-fb9fe3e63ddf",
            "384a7a6e-8e8b-49aa-866e-01ea758285e8",
            "4c343774-29d0-4499-9ad6-0b259162f2f2",
            "79c7a047-c175-4644-88cb-9527902e1fe4",
            "c3a566c8-681d-4d5f-a6b3-30242151b530"
          ]
        },
        {
          "From": "1de4e584-d07b-493f-b42a-37ecb13bd3fc",
          "To": [
            "46c85ad8-388b-4860-9fc7-edc8e085dbbe",
            "7e36dce9-cdc4-4f13-9205-87f3e5c00a7e"
          ]
        },
        {
          "From": "1f50e9ef-b06d-412a-8c2a-390688b5294e",
          "To": [
            "7e36dce9-cdc4-4f13-9205-87f3e5c00a7e",
            "d2db5848-12b5-4090-9283-ed79f0404727"
          ]
        },
        {
          "From": "221fa763-5fd0-451b-be96-6a857951c78b",
          "To": [
            "4c343774-29d0-4499-9ad6-0b259162f2f2",
            "7c12feed-53d7-44fc-8cc5-02032816a355",
            "b8156a56-6c1d-4b16-81f6-0a097715178a"
          ]
        },
        {
          "From": "2bc09d19-1c36-48b9-a9ae-95a2cbeee327",
          "To": [
            "1d06e6c7-d1fe-42dd-861d-3ca04b515b04",
            "46c85ad8-388b-4860-9fc7-edc8e085dbbe",
            "526c3bc7-a265-415c-8ead-13d0a2bb5dfb"
          ]
        },
        {
          "From": "350fe3f6-92b4-4b17-bf7c-981f86ab474c",
          "To": [
            "1d06e6c7-d1fe-42dd-861d-3ca04b515b04",
            "46c85ad8-388b-4860-9fc7-edc8e085dbbe",
            "7e36dce9-cdc4-4f13-9205-87f3e5c00a7e"
          ]
        },
        {
          "From": "384a7a6e-8e8b-49aa-866e-01ea758285e8",
          "To": [
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "3f680088-5456-4d87-8c9b-f05f4a710694",
          "To": [
            "643dfcfd-e6cc-4132-8fd4-c9fc6fcc9480",
            "6df1206e-5144-49b9-88d9-a3d515571f00",
            "fd925e92-4e22-488f-ae76-32d9c1ba6ca1"
          ]
        },
        {
          "From": "4bb88072-f6f0-4296-b04f-d9448a92d927",
          "To": [
            "55ed1fcc-db27-413e-be3a-296ed6729c46"
          ]
        },
        {
          "From": "4c343774-29d0-4499-9ad6-0b259162f2f2",
          "To": [
            "15fde248-9fc1-4046-8fb4-bdfcff77ab44",
            "485e81f5-29ba-47e7-97c5-2915181afbcd",
            "5ca8c53c-ee09-4020-94e9-594658dcfa4d",
            "5ceb92d4-b375-4de3-a86a-8f8b3e73f4b7",
            "900b929e-d6da-4913-aaf1-494a5eacc490",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "51444558-075e-4248-9e48-222fa1a0f40b",
          "To": [
            "7c12feed-53d7-44fc-8cc5-02032816a355",
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "84980ad8-5d6c-495d-bc8d-9855929bcee8",
            "8555539b-7bab-4d94-a966-b566c6c93207",
            "a61f12d0-3314-4ddb-840f-b759a6b63bf7",
            "cf7d5c64-dfa1-471f-8b57-ebe1ce7dddc0",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2",
            "f8a4b2c8-1f9a-4f49-9d76-8136b13f46dd"
          ]
        },
        {
          "From": "5fc4dd93-3a69-455e-a557-38175d2855c5",
          "To": [
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "cf7d5c64-dfa1-471f-8b57-ebe1ce7dddc0",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "743698bb-ecfe-425d-8737-39ac1a6070d2",
          "To": [
            "14def45f-5aed-49d4-8b6f-7e02fbec801f",
            "84980ad8-5d6c-495d-bc8d-9855929bcee8"
          ]
        },
        {
          "From": "a39bf978-8db3-4b32-942c-dec78a0ee043",
          "To": [
            "3ae5fbac-de00-4ef3-9f0a-39543fbcb049"
          ]
        },
        {
          "From": "ba201aee-84b7-4c18-80b0-2216596f4fb1",
          "To": [
            "b8156a56-6c1d-4b16-81f6-0a097715178a"
          ]
        },
        {
          "From": "c0c8307b-06b4-4c37-b945-bf23ed885f69",
          "To": [
            "09c2e4e0-ba53-4404-bc6c-4d062890555f",
            "4feaa549-fd7f-4d80-8a1b-04975799d281",
            "900b929e-d6da-4913-aaf1-494a5eacc490"
          ]
        },
        {
          "From": "c12605b1-80ea-4942-a5e2-37c5a3eaec75",
          "To": [
            "46c85ad8-388b-4860-9fc7-edc8e085dbbe",
            "526c3bc7-a265-415c-8ead-13d0a2bb5dfb",
            "7e36dce9-cdc4-4f13-9205-87f3e5c00a7e"
          ]
        },
        {
          "From": "cb46010e-90db-4d8c-bf9a-1981dede1814",
          "To": [
            "384a7a6e-8e8b-49aa-866e-01ea758285e8",
            "7c12feed-53d7-44fc-8cc5-02032816a355",
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "b076eb9e-ae9c-4597-906a-8e6e8d901d10",
            "cf7d5c64-dfa1-471f-8b57-ebe1ce7dddc0",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "d2db5848-12b5-4090-9283-ed79f0404727",
          "To": [
            "085e2ef3-2d6e-4dd3-9036-40fde43ff2ee",
            "10d8e534-12b3-4a5c-a8be-560ff0f74836",
            "e46128b0-4948-4d0a-9c43-e3b8be1973e7"
          ]
        },
        {
          "From": "d2f14d32-8dd3-42a9-867f-2fae8143d5b6",
          "To": [
            "3f680088-5456-4d87-8c9b-f05f4a710694",
            "532dd5ce-10ce-4079-aaf8-798ec66eddd0",
            "aa49ef94-2ad9-4111-8196-bb457b438abd",
            "c120954f-944e-4bcb-a220-916d45beadb4",
            "d53bb8cc-1d0d-493f-8247-26048c7174ee",
            "d5d5dd6e-c22c-48e4-bbb3-308c8c8474eb",
            "e46128b0-4948-4d0a-9c43-e3b8be1973e7"
          ]
        },
        {
          "From": "deda5c80-1e4c-44ae-80e5-79cb3a6d2129",
          "To": [
            "15fde248-9fc1-4046-8fb4-bdfcff77ab44",
            "225a32a2-1a2c-49d9-96f7-c43b7b863e84",
            "9efff58d-7064-457b-9157-b6eb91ed0f63",
            "dd8ba96c-d491-462c-851c-74f6910986bd"
          ]
        },
        {
          "From": "f738111f-5337-4ebb-a6d5-edde360ed125",
          "To": [
            "11c20fe7-0461-4940-b213-fb9fe3e63ddf",
            "5ceb92d4-b375-4de3-a86a-8f8b3e73f4b7",
            "900b929e-d6da-4913-aaf1-494a5eacc490",
            "b86958fc-a002-41e4-a5f7-87ba612d910d",
            "c3a566c8-681d-4d5f-a6b3-30242151b530"
          ]
        },
        {
          "From": "09351429-43da-4f88-ab31-b542350b491e",
          "To": [
            "11c20fe7-0461-4940-b213-fb9fe3e63ddf",
            "dc6605ae-7436-48b8-87b9-ad6492006dfe"
          ]
        },
        {
          "From": "09c2e4e0-ba53-4404-bc6c-4d062890555f",
          "To": [
            "4bb88072-f6f0-4296-b04f-d9448a92d927",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "14def45f-5aed-49d4-8b6f-7e02fbec801f",
          "To": [
            "84980ad8-5d6c-495d-bc8d-9855929bcee8",
            "a7b033eb-2595-42f1-81b4-164cb4861190",
            "cca005e7-cc94-4a34-bb20-778dcfe0443c"
          ]
        },
        {
          "From": "1d06e6c7-d1fe-42dd-861d-3ca04b515b04",
          "To": [
            "94291f95-6b94-4757-a0bd-26874780edf2"
          ]
        },
        {
          "From": "4209f509-6aac-46c7-986e-6ad68491aae5",
          "To": [
            "84980ad8-5d6c-495d-bc8d-9855929bcee8"
          ]
        },
        {
          "From": "485e81f5-29ba-47e7-97c5-2915181afbcd",
          "To": [
            "143cae9d-a474-4f5a-aba3-1d6f170bfa82",
            "4f615bf0-d4dd-4b3b-bb4b-4046bb458f30",
            "772dfd3a-cdc9-40b2-a9a7-710d7d216d70"
          ]
        },
        {
          "From": "4feaa549-fd7f-4d80-8a1b-04975799d281",
          "To": [
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "526c3bc7-a265-415c-8ead-13d0a2bb5dfb",
          "To": [
            "46c85ad8-388b-4860-9fc7-edc8e085dbbe",
            "a817d227-45f8-4acd-a71f-a92df80d2f35",
            "eeb1c59e-cc62-4c25-8ac4-6258f33df837"
          ]
        },
        {
          "From": "5ceb92d4-b375-4de3-a86a-8f8b3e73f4b7",
          "To": [
            "cf7d5c64-dfa1-471f-8b57-ebe1ce7dddc0",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "5f9d138b-c974-4175-8273-7212ffa76497",
          "To": [
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "a61f12d0-3314-4ddb-840f-b759a6b63bf7",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "6df1206e-5144-49b9-88d9-a3d515571f00",
          "To": [
            "023381b2-15a5-4c61-ba10-6f440b5c651d"
          ]
        },
        {
          "From": "79c7a047-c175-4644-88cb-9527902e1fe4",
          "To": [
            "11c20fe7-0461-4940-b213-fb9fe3e63ddf",
            "dc6605ae-7436-48b8-87b9-ad6492006dfe"
          ]
        },
        {
          "From": "7c12feed-53d7-44fc-8cc5-02032816a355",
          "To": [
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "7e36dce9-cdc4-4f13-9205-87f3e5c00a7e",
          "To": [
            "46c85ad8-388b-4860-9fc7-edc8e085dbbe",
            "a817d227-45f8-4acd-a71f-a92df80d2f35",
            "eeb1c59e-cc62-4c25-8ac4-6258f33df837"
          ]
        },
        {
          "From": "7f339d64-f9b8-40a8-b3ba-a38816bea125",
          "To": [
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "8555539b-7bab-4d94-a966-b566c6c93207",
          "To": [
            "5f9d138b-c974-4175-8273-7212ffa76497",
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "a61f12d0-3314-4ddb-840f-b759a6b63bf7",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "900b929e-d6da-4913-aaf1-494a5eacc490",
          "To": [
            "5ceb92d4-b375-4de3-a86a-8f8b3e73f4b7"
          ]
        },
        {
          "From": "9efff58d-7064-457b-9157-b6eb91ed0f63",
          "To": [
            "dd8ba96c-d491-462c-851c-74f6910986bd"
          ]
        },
        {
          "From": "a61f12d0-3314-4ddb-840f-b759a6b63bf7",
          "To": [
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "b076eb9e-ae9c-4597-906a-8e6e8d901d10",
          "To": [
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "b86958fc-a002-41e4-a5f7-87ba612d910d",
          "To": [
            "5ceb92d4-b375-4de3-a86a-8f8b3e73f4b7"
          ]
        },
        {
          "From": "c3a566c8-681d-4d5f-a6b3-30242151b530",
          "To": [
            "11c20fe7-0461-4940-b213-fb9fe3e63ddf",
            "36829d25-984d-4212-949a-81a4ac1a51eb",
            "dc6605ae-7436-48b8-87b9-ad6492006dfe"
          ]
        },
        {
          "From": "cf7d5c64-dfa1-471f-8b57-ebe1ce7dddc0",
          "To": [
            "7c12feed-53d7-44fc-8cc5-02032816a355",
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "b076eb9e-ae9c-4597-906a-8e6e8d901d10",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "d53bb8cc-1d0d-493f-8247-26048c7174ee",
          "To": [
            "532dd5ce-10ce-4079-aaf8-798ec66eddd0"
          ]
        },
        {
          "From": "efe99a55-b7eb-4bf5-8024-b82df10e68f2",
          "To": [
            "f5a64733-8ad6-4908-9c1c-2d773e093df5"
          ]
        },
        {
          "From": "f8a4b2c8-1f9a-4f49-9d76-8136b13f46dd",
          "To": [
            "7f339d64-f9b8-40a8-b3ba-a38816bea125",
            "84980ad8-5d6c-495d-bc8d-9855929bcee8",
            "efe99a55-b7eb-4bf5-8024-b82df10e68f2"
          ]
        },
        {
          "From": "143cae9d-a474-4f5a-aba3-1d6f170bfa82",
          "To": [
            "84980ad8-5d6c-495d-bc8d-9855929bcee8",
            "8a7c2688-0814-49eb-8e2d-475548ff8154"
          ]
        },
        {
          "From": "4f615bf0-d4dd-4b3b-bb4b-4046bb458f30",
          "To": [
            "84980ad8-5d6c-495d-bc8d-9855929bcee8"
          ]
        },
        {
          "From": "772dfd3a-cdc9-40b2-a9a7-710d7d216d70",
          "To": [
            "15849b7c-eed9-44ad-aff1-40c3d91a138f",
            "2bc09d19-1c36-48b9-a9ae-95a2cbeee327",
            "84980ad8-5d6c-495d-bc8d-9855929bcee8",
            "c12605b1-80ea-4942-a5e2-37c5a3eaec75"
          ]
        },
        {
          "From": "94291f95-6b94-4757-a0bd-26874780edf2",
          "To": [
            "eb02650d-a09c-42f3-af27-e3c79085881d"
          ]
        },
        {
          "From": "a817d227-45f8-4acd-a71f-a92df80d2f35",
          "To": [
            "46c85ad8-388b-4860-9fc7-edc8e085dbbe"
          ]
        }
      ]
    },
    {
      "Id": "d5d5dd6e-c22c-48e4-bbb3-308c8c8474eb",
      "Name": "antlr:antlr",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.7.7"
      },
      "Purl": "pkg:maven/antlr/antlr@2.7.7",
      "Compare": {
        "Hash": "9fd444ccfeebf99beff2e5ffb270a9d75e8c0293"
      }
    },
    {
      "Id": "143cae9d-a474-4f5a-aba3-1d6f170bfa82",
      "Name": "ch.qos.logback:logback-classic",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.2.11"
      },
      "Purl": "pkg:maven/ch.qos.logback/logback-classic@1.2.11",
      "Compare": {
        "Hash": "1a549ef5a539b1ed9c1bddb56b295afa775d6ea7"
      }
    },
    {
      "Id": "8a7c2688-0814-49eb-8e2d-475548ff8154",
      "Name": "ch.qos.logback:logback-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.2.11"
      },
      "Purl": "pkg:maven/ch.qos.logback/logback-core@1.2.11",
      "Compare": {
        "Hash": "11b2cd5167ea1e749f9858b49c99e11e3578808f"
      }
    },
    {
      "Id": "36829d25-984d-4212-949a-81a4ac1a51eb",
      "Name": "com.fasterxml.jackson.core:jackson-annotations",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.13.3"
      },
      "Purl": "pkg:maven/com.fasterxml.jackson.core/jackson-annotations@2.13.3",
      "Compare": {
        "Hash": "4ece32bf3ab3aaaa234500cd30374b10c6952b91"
      }
    },
    {
      "Id": "dc6605ae-7436-48b8-87b9-ad6492006dfe",
      "Name": "com.fasterxml.jackson.core:jackson-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.13.3"
      },
      "Purl": "pkg:maven/com.fasterxml.jackson.core/jackson-core@2.13.3",
      "Compare": {
        "Hash": "f530021069e0885128f7dddb7aaff0c2eef16d74"
      }
    },
    {
      "Id": "11c20fe7-0461-4940-b213-fb9fe3e63ddf",
      "Name": "com.fasterxml.jackson.core:jackson-databind",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.13.3"
      },
      "Purl": "pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.13.3",
      "Compare": {
        "Hash": "47fe08f59eca1298c1821a7e0754c57ff0ee7c76"
      }
    },
    {
      "Id": "09351429-43da-4f88-ab31-b542350b491e",
      "Name": "com.fasterxml.jackson.datatype:jackson-datatype-jdk8",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.13.3"
      },
      "Purl": "pkg:maven/com.fasterxml.jackson.datatype/jackson-datatype-jdk8@2.13.3",
      "Compare": {
        "Hash": "620bec002ffcc33c640907f4d2b84c06323e26ca"
      }
    },
    {
      "Id": "c3a566c8-681d-4d5f-a6b3-30242151b530",
      "Name": "com.fasterxml.jackson.datatype:jackson-datatype-jsr310",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 1
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.13.3"
      },
      "Purl": "pkg:maven/com.fasterxml.jackson.datatype/jackson-datatype-jsr310@2.13.3",
      "Compare": {
        "Hash": "6371955205c7fe55ea4ede52a2809e7d362162af"
      }
    },
    {
      "Id": "79c7a047-c175-4644-88cb-9527902e1fe4",
      "Name": "com.fasterxml.jackson.module:jackson-module-parameter-names",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.13.3"
      },
      "Purl": "pkg:maven/com.fasterxml.jackson.module/jackson-module-parameter-names@2.13.3",
      "Compare": {
        "Hash": "18d7213ccabbc0fe0e9162f855a5d2bb7753218e"
      }
    },
    {
      "Id": "c120954f-944e-4bcb-a220-916d45beadb4",
      "Name": "com.fasterxml:classmate",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 1
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "1.5.1"
      },
      "Purl": "pkg:maven/com.fasterxml/classmate@1.5.1",
      "Compare": {
        "Hash": "c2a77b502e238f5f5f5f60cb60d64108ab86c999"
      }
    },
    {
      "Id": "fc3e2bbe-f17e-44a8-a727-16c745163862",
      "Name": "com.h2database:h2",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.1.214"
      },
      "Purl": "pkg:maven/com.h2database/h2@2.1.214",
      "Compare": {
        "Hash": "a1778653af537b389ebaccfacfbea7f3cdaa10ad"
      }
    },
    {
      "Id": "fd925e92-4e22-488f-ae76-32d9c1ba6ca1",
      "Name": "com.sun.activation:jakarta.activation",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9858491
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "1.2.2"
      },
      "Purl": "pkg:maven/com.sun.activation/jakarta.activation@1.2.2",
      "Compare": {
        "Hash": "72c6a00f183e2d1fd1951f6e9e2b56bd7e3a6794"
      }
    },
    {
      "Id": "643dfcfd-e6cc-4132-8fd4-c9fc6fcc9480",
      "Name": "com.sun.istack:istack-commons-runtime",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9858491
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "3.0.12"
      },
      "Purl": "pkg:maven/com.sun.istack/istack-commons-runtime@3.0.12",
      "Compare": {
        "Hash": "3b67445da619d4097e2ffc4d758fa2caf70d98ae"
      }
    },
    {
      "Id": "4209f509-6aac-46c7-986e-6ad68491aae5",
      "Name": "com.zaxxer:HikariCP",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "4.0.3"
      },
      "Purl": "pkg:maven/com.zaxxer/HikariCP@4.0.3",
      "Compare": {
        "Hash": "c5432cb79c5f41554de401e5b995fffc7ef87e2b"
      }
    },
    {
      "Id": "cc8e30b5-f548-4912-953e-a95981a24d62",
      "Name": "io.github.classgraph:classgraph",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "4.8.139"
      },
      "Purl": "pkg:maven/io.github.classgraph/classgraph@4.8.139",
      "Compare": {
        "Hash": "a8a4972246dfbab80c5f5e284f9248ddf2b91440"
      }
    },
    {
      "Id": "a39bf978-8db3-4b32-942c-dec78a0ee043",
      "Name": "io.micrometer:micrometer-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9857513
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9001297
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "1.9.1"
      },
      "Purl": "pkg:maven/io.micrometer/micrometer-core@1.9.1",
      "Compare": {
        "Hash": "f3c96882de75d859d801bd10249ab15aa0d898d3"
      }
    },
    {
      "Id": "4bb88072-f6f0-4296-b04f-d9448a92d927",
      "Name": "io.projectreactor:reactor-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "3.4.19"
      },
      "Purl": "pkg:maven/io.projectreactor/reactor-core@3.4.19",
      "Compare": {
        "Hash": "7a87e99b13267432876d2f4713b713e5317b954e"
      }
    },
    {
      "Id": "023381b2-15a5-4c61-ba10-6f440b5c651d",
      "Name": "jakarta.activation:jakarta.activation-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9858491
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "1.2.2"
      },
      "Purl": "pkg:maven/jakarta.activation/jakarta.activation-api@1.2.2",
      "Compare": {
        "Hash": "d6a177cedf8b426a5b15173cdcb8416c38b60f03"
      }
    },
    {
      "Id": "15fde248-9fc1-4046-8fb4-bdfcff77ab44",
      "Name": "jakarta.annotation:jakarta.annotation-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "EPL-2.0",
              "Confidence": 0.9995252
            },
            {
              "Name": "GPL-2.0-only",
              "Confidence": 0.9771798
            },
            {
              "Name": "GPL-2.0-or-later",
              "Confidence": 0.9771798
            },
            {
              "Name": "GPL-2.0",
              "Confidence": 0.9771798
            },
            {
              "Name": "GPL-2.0+",
              "Confidence": 0.9771798
            },
            {
              "Name": "GPL-2.0-with-classpath-exception",
              "Confidence": 0.9371069
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "1.3.5"
      },
      "Purl": "pkg:maven/jakarta.annotation/jakarta.annotation-api@1.3.5",
      "Compare": {
        "Hash": "475ef33ea7917d9aee9b96f4c5c51f13ed53f935"
      }
    },
    {
      "Id": "5d4d803c-6f1b-46ff-be51-c3ab0252a967",
      "Name": "jakarta.persistence:jakarta.persistence-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.2.3"
      },
      "Purl": "pkg:maven/jakarta.persistence/jakarta.persistence-api@2.2.3",
      "Compare": {
        "Hash": "da3adc078c9a202d50693671c5a9861dd29bbdad"
      }
    },
    {
      "Id": "af136547-6d17-4afd-bec9-5bd9706ea68e",
      "Name": "jakarta.transaction:jakarta.transaction-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.3.3"
      },
      "Purl": "pkg:maven/jakarta.transaction/jakarta.transaction-api@1.3.3",
      "Compare": {
        "Hash": "a4b247b81fce0f2ecbb78e8535cf3da9273d8d7a"
      }
    },
    {
      "Id": "542d3822-5b3b-43be-8f4a-a8b4039fab48",
      "Name": "jakarta.validation:jakarta.validation-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.0.2"
      },
      "Purl": "pkg:maven/jakarta.validation/jakarta.validation-api@2.0.2",
      "Compare": {
        "Hash": "ecbc55b43ca87a5d966161f376662dd59fe9086a"
      }
    },
    {
      "Id": "6df1206e-5144-49b9-88d9-a3d515571f00",
      "Name": "jakarta.xml.bind:jakarta.xml.bind-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9858491
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.3.3"
      },
      "Purl": "pkg:maven/jakarta.xml.bind/jakarta.xml.bind-api@2.3.3",
      "Compare": {
        "Hash": "cfb8fd2213745a9b74c5275d6fbbd05c73d04bd7"
      }
    },
    {
      "Id": "5853f0a0-5d49-43e0-a2f0-2099a757b909",
      "Name": "javax.cache:cache-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.1.1"
      },
      "Purl": "pkg:maven/javax.cache/cache-api@1.1.1",
      "Compare": {
        "Hash": "ec2e41dad6b04fe92f3cb017649adef0a7409049"
      }
    },
    {
      "Id": "1d06e6c7-d1fe-42dd-861d-3ca04b515b04",
      "Name": "junit:junit",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "4.13.2"
      },
      "Purl": "pkg:maven/junit/junit@4.13.2",
      "Compare": {
        "Hash": "50e61be49e7d9623fa5daf292d5b070797e6c7a2"
      }
    },
    {
      "Id": "f33a544b-b0a2-47f1-bd28-e543ffb64bf9",
      "Name": "mysql:mysql-connector-java",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 1
            },
            {
              "Name": "Unicode-TOU",
              "Confidence": 1
            },
            {
              "Name": "EPL-2.0",
              "Confidence": 0.9990508
            },
            {
              "Name": "GPL-2.0+",
              "Confidence": 0.97405255
            },
            {
              "Name": "GPL-2.0-only",
              "Confidence": 0.97268695
            },
            {
              "Name": "GPL-2.0",
              "Confidence": 0.97268695
            },
            {
              "Name": "GPL-2.0-or-later",
              "Confidence": 0.97268695
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.971564
            },
            {
              "Name": "LGPL-2.1",
              "Confidence": 0.96377635
            },
            {
              "Name": "LGPL-2.1-or-later",
              "Confidence": 0.96377635
            },
            {
              "Name": "LGPL-2.1-only",
              "Confidence": 0.96377635
            },
            {
              "Name": "LGPL-2.1+",
              "Confidence": 0.9635499
            },
            {
              "Name": "UPL-1.0",
              "Confidence": 0.92134833
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "8.0.29"
      },
      "Purl": "pkg:maven/mysql/mysql-connector-java@8.0.29",
      "Compare": {
        "Hash": "fc62de75e4b2ac0aa3aae0ffa67fa41de02e1485"
      }
    },
    {
      "Id": "085e2ef3-2d6e-4dd3-9036-40fde43ff2ee",
      "Name": "net.bytebuddy:byte-buddy-agent",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.12.11"
      },
      "Purl": "pkg:maven/net.bytebuddy/byte-buddy-agent@1.12.11",
      "Compare": {
        "Hash": "4c068e5425215b3c94b4808a8ea2c44f3e1b3287"
      }
    },
    {
      "Id": "e46128b0-4948-4d0a-9c43-e3b8be1973e7",
      "Name": "net.bytebuddy:byte-buddy",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.12.11"
      },
      "Purl": "pkg:maven/net.bytebuddy/byte-buddy@1.12.11",
      "Compare": {
        "Hash": "8d2db3e5ecb93a4cc598d09d1a02607533b0c8a7"
      }
    },
    {
      "Id": "15849b7c-eed9-44ad-aff1-40c3d91a138f",
      "Name": "org.apache.logging.log4j:log4j-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.15.0"
      },
      "Purl": "pkg:maven/org.apache.logging.log4j/log4j-api@2.15.0",
      "Compare": {
        "Hash": "7fa8b5cce9467424b896dcc14b377c8ee534e2e2"
      }
    },
    {
      "Id": "285a3fbc-4152-42b6-8b12-c2320096fabd",
      "Name": "org.apache.logging.log4j:log4j-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.15.0"
      },
      "Purl": "pkg:maven/org.apache.logging.log4j/log4j-core@2.15.0",
      "Compare": {
        "Hash": "d782ece78946bd64a38bb25e7b0807625ae477d0"
      }
    },
    {
      "Id": "772dfd3a-cdc9-40b2-a9a7-710d7d216d70",
      "Name": "org.apache.logging.log4j:log4j-to-slf4j",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.17.2"
      },
      "Purl": "pkg:maven/org.apache.logging.log4j/log4j-to-slf4j@2.17.2",
      "Compare": {
        "Hash": "ea3cd3152b9d83cdc81ea476f5d54596df51979e"
      }
    },
    {
      "Id": "dd8ba96c-d491-462c-851c-74f6910986bd",
      "Name": "org.apache.tomcat.embed:tomcat-embed-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 1
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "9.0.64"
      },
      "Purl": "pkg:maven/org.apache.tomcat.embed/tomcat-embed-core@9.0.64",
      "Compare": {
        "Hash": "b0000a8c375fa545d953ef82be8719bb9be3ed1a"
      }
    },
    {
      "Id": "225a32a2-1a2c-49d9-96f7-c43b7b863e84",
      "Name": "org.apache.tomcat.embed:tomcat-embed-el",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "9.0.64"
      },
      "Purl": "pkg:maven/org.apache.tomcat.embed/tomcat-embed-el@9.0.64",
      "Compare": {
        "Hash": "79eaad07ebb7e8a0e59617be75faef9a724d467a"
      }
    },
    {
      "Id": "9efff58d-7064-457b-9157-b6eb91ed0f63",
      "Name": "org.apache.tomcat.embed:tomcat-embed-websocket",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "9.0.64"
      },
      "Purl": "pkg:maven/org.apache.tomcat.embed/tomcat-embed-websocket@9.0.64",
      "Compare": {
        "Hash": "c37f8f7b9be14d1e88cd138bfe532c4633bb96cf"
      }
    },
    {
      "Id": "46c85ad8-388b-4860-9fc7-edc8e085dbbe",
      "Name": "org.apiguardian:apiguardian-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98704666
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9001297
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "1.1.2"
      },
      "Purl": "pkg:maven/org.apiguardian/apiguardian-api@1.1.2",
      "Compare": {
        "Hash": "3c76365b5644b9a5a9dbde092448ee52773ad49a"
      }
    },
    {
      "Id": "b8156a56-6c1d-4b16-81f6-0a097715178a",
      "Name": "org.aspectj:aspectjweaver",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.9.7"
      },
      "Purl": "pkg:maven/org.aspectj/aspectjweaver@1.9.7",
      "Compare": {
        "Hash": "abc20396a262890ceb23f6ce26272f531f25889b"
      }
    },
    {
      "Id": "ecfb238d-8551-4aae-b063-2d3c74f8d748",
      "Name": "org.assertj:assertj-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "3.22.0"
      },
      "Purl": "pkg:maven/org.assertj/assertj-core@3.22.0",
      "Compare": {
        "Hash": "efaf7ff7d41b9d8234a97a906acbe527bad55894"
      }
    },
    {
      "Id": "a7b033eb-2595-42f1-81b4-164cb4861190",
      "Name": "org.attoparser:attoparser",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.0.5.RELEASE"
      },
      "Purl": "pkg:maven/org.attoparser/attoparser@2.0.5.RELEASE",
      "Compare": {
        "Hash": "9d952f2b6b93bae1340eda2f144928238b4bba7e"
      }
    },
    {
      "Id": "a6c125e0-14f3-44e5-9409-a4b6d7753c15",
      "Name": "org.checkerframework:checker-qual",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "MIT",
              "Confidence": 0.9819277
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "3.5.0"
      },
      "Purl": "pkg:maven/org.checkerframework/checker-qual@3.5.0",
      "Compare": {
        "Hash": "702341246f96e3af5dadd686292e89733a8aa93f"
      }
    },
    {
      "Id": "3db9823b-661e-4452-b677-7aae1f7a84e4",
      "Name": "org.ehcache:ehcache",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "3.10.0"
      },
      "Purl": "pkg:maven/org.ehcache/ehcache@3.10.0",
      "Compare": {
        "Hash": "350c58e2e18ce6ef397768c9dc00b66d43aadee7"
      }
    },
    {
      "Id": "3f680088-5456-4d87-8c9b-f05f4a710694",
      "Name": "org.glassfish.jaxb:jaxb-runtime",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9858491
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.3.6"
      },
      "Purl": "pkg:maven/org.glassfish.jaxb/jaxb-runtime@2.3.6",
      "Compare": {
        "Hash": "7e281c1c7ec725ae00b22b38b8f1ca09fb3d3bb9"
      }
    },
    {
      "Id": "94291f95-6b94-4757-a0bd-26874780edf2",
      "Name": "org.hamcrest:hamcrest-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.2"
      },
      "Purl": "pkg:maven/org.hamcrest/hamcrest-core@2.2",
      "Compare": {
        "Hash": "a42cd0a1e1ae39914d0346867f43e1cd64b27990"
      }
    },
    {
      "Id": "eb02650d-a09c-42f3-af27-e3c79085881d",
      "Name": "org.hamcrest:hamcrest",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.2"
      },
      "Purl": "pkg:maven/org.hamcrest/hamcrest@2.2",
      "Compare": {
        "Hash": "a10896654c98ef6007569260114e4ef5d792b37a"
      }
    },
    {
      "Id": "d53bb8cc-1d0d-493f-8247-26048c7174ee",
      "Name": "org.hibernate.common:hibernate-commons-annotations",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "5.1.2.Final"
      },
      "Purl": "pkg:maven/org.hibernate.common/hibernate-commons-annotations@5.1.2.Final",
      "Compare": {
        "Hash": "ad4b7ae4c080d24b47e12b45aff27c90e00a9c7a"
      }
    },
    {
      "Id": "0d982db2-e530-47c7-b570-a2c75665e5c2",
      "Name": "org.hibernate.validator:hibernate-validator",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "6.2.3.Final"
      },
      "Purl": "pkg:maven/org.hibernate.validator/hibernate-validator@6.2.3.Final",
      "Compare": {
        "Hash": "7f7fa7331b4c9f88dec1f69f9c95b6fa1183d747"
      }
    },
    {
      "Id": "d2f14d32-8dd3-42a9-867f-2fae8143d5b6",
      "Name": "org.hibernate:hibernate-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "5.6.9.Final"
      },
      "Purl": "pkg:maven/org.hibernate/hibernate-core@5.6.9.Final",
      "Compare": {
        "Hash": "3d08922156ebfe34228f81d755d7ac2d6bd49586"
      }
    },
    {
      "Id": "532dd5ce-10ce-4079-aaf8-798ec66eddd0",
      "Name": "org.jboss.logging:jboss-logging",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "3.4.3.Final"
      },
      "Purl": "pkg:maven/org.jboss.logging/jboss-logging@3.4.3.Final",
      "Compare": {
        "Hash": "5dce8a78f4a5ed2175406dd940e18a4e5af73d81"
      }
    },
    {
      "Id": "aa49ef94-2ad9-4111-8196-bb457b438abd",
      "Name": "org.jboss:jandex",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.4.2.Final"
      },
      "Purl": "pkg:maven/org.jboss/jandex@2.4.2.Final",
      "Compare": {
        "Hash": "2ecba475f7eef329e933b2c7cce739fa6221c2ea"
      }
    },
    {
      "Id": "7e36dce9-cdc4-4f13-9205-87f3e5c00a7e",
      "Name": "org.junit.jupiter:junit-jupiter-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "EPL-2.0",
              "Confidence": 0.99810517
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.8.2"
      },
      "Purl": "pkg:maven/org.junit.jupiter/junit-jupiter-api@5.8.2",
      "Compare": {
        "Hash": "25554cf387e3d4a317baef03e08121ea49854938"
      }
    },
    {
      "Id": "c12605b1-80ea-4942-a5e2-37c5a3eaec75",
      "Name": "org.junit.jupiter:junit-jupiter-engine",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "EPL-2.0",
              "Confidence": 0.99810517
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.8.2"
      },
      "Purl": "pkg:maven/org.junit.jupiter/junit-jupiter-engine@5.8.2",
      "Compare": {
        "Hash": "8d5b81eeb0c26e0e6ecb37cda6e5a5de3e577712"
      }
    },
    {
      "Id": "350fe3f6-92b4-4b17-bf7c-981f86ab474c",
      "Name": "org.junit.jupiter:junit-jupiter-migrationsupport",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "EPL-2.0",
              "Confidence": 0.99810517
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.8.2"
      },
      "Purl": "pkg:maven/org.junit.jupiter/junit-jupiter-migrationsupport@5.8.2",
      "Compare": {
        "Hash": "df732c88517f9cb91edec60b7934ea71f198666b"
      }
    },
    {
      "Id": "1de4e584-d07b-493f-b42a-37ecb13bd3fc",
      "Name": "org.junit.jupiter:junit-jupiter-params",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "EPL-2.0",
              "Confidence": 0.99810517
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.8.2"
      },
      "Purl": "pkg:maven/org.junit.jupiter/junit-jupiter-params@5.8.2",
      "Compare": {
        "Hash": "26a7d3d1b0389b008ca7faae80736770cddeea46"
      }
    },
    {
      "Id": "a817d227-45f8-4acd-a71f-a92df80d2f35",
      "Name": "org.junit.platform:junit-platform-commons",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "EPL-2.0",
              "Confidence": 0.99810517
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "1.8.2"
      },
      "Purl": "pkg:maven/org.junit.platform/junit-platform-commons@1.8.2",
      "Compare": {
        "Hash": "8e2551d87f41494a6721978d734ad2a7f8227b11"
      }
    },
    {
      "Id": "526c3bc7-a265-415c-8ead-13d0a2bb5dfb",
      "Name": "org.junit.platform:junit-platform-engine",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "EPL-2.0",
              "Confidence": 0.99810517
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "1.8.2"
      },
      "Purl": "pkg:maven/org.junit.platform/junit-platform-engine@1.8.2",
      "Compare": {
        "Hash": "add322a323e13d3d8ae38a9989e31741ab7bff49"
      }
    },
    {
      "Id": "2bc09d19-1c36-48b9-a9ae-95a2cbeee327",
      "Name": "org.junit.vintage:junit-vintage-engine",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.md",
          "LicensesInfo": [
            {
              "Name": "EPL-2.0",
              "Confidence": 0.99810517
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.8.2"
      },
      "Purl": "pkg:maven/org.junit.vintage/junit-vintage-engine@5.8.2",
      "Compare": {
        "Hash": "40427032e7473c2b3c6ee6f7c5518bf357ebc8d9"
      }
    },
    {
      "Id": "3ae5fbac-de00-4ef3-9f0a-39543fbcb049",
      "Name": "org.latencyutils:LatencyUtils",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.0.3"
      },
      "Purl": "pkg:maven/org.latencyutils/LatencyUtils@2.0.3",
      "Compare": {
        "Hash": "3491f01403edf9b421d9b647dc9e335077aca510"
      }
    },
    {
      "Id": "d2db5848-12b5-4090-9283-ed79f0404727",
      "Name": "org.mockito:mockito-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "4.5.1"
      },
      "Purl": "pkg:maven/org.mockito/mockito-core@4.5.1",
      "Compare": {
        "Hash": "76c930decffa7486f184fb3de6b1eb642ca5986a"
      }
    },
    {
      "Id": "1f50e9ef-b06d-412a-8c2a-390688b5294e",
      "Name": "org.mockito:mockito-junit-jupiter",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "4.5.1"
      },
      "Purl": "pkg:maven/org.mockito/mockito-junit-jupiter@4.5.1",
      "Compare": {
        "Hash": "69b765d4cb9583adceb5106b4d47bd8e7b98fe7e"
      }
    },
    {
      "Id": "10d8e534-12b3-4a5c-a8be-560ff0f74836",
      "Name": "org.objenesis:objenesis",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "3.2"
      },
      "Purl": "pkg:maven/org.objenesis/objenesis@3.2",
      "Compare": {
        "Hash": "77a111f4ac30abed9748f9def95166d0cb283152"
      }
    },
    {
      "Id": "eeb1c59e-cc62-4c25-8ac4-6258f33df837",
      "Name": "org.opentest4j:opentest4j",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.2.0"
      },
      "Purl": "pkg:maven/org.opentest4j/opentest4j@1.2.0",
      "Compare": {
        "Hash": "a82c129e3a430f82ac75a9a827849004a52f8843"
      }
    },
    {
      "Id": "9b96826a-5676-43ea-81b5-c44dc3473643",
      "Name": "org.postgresql:postgresql",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE",
          "LicensesInfo": [
            {
              "Name": "BSD-2-Clause",
              "Confidence": 0.9239766
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "42.3.6"
      },
      "Purl": "pkg:maven/org.postgresql/postgresql@42.3.6",
      "Compare": {
        "Hash": "e5d1e25bb17ab382c58ef023b75346727b226622"
      }
    },
    {
      "Id": "55ed1fcc-db27-413e-be3a-296ed6729c46",
      "Name": "org.reactivestreams:reactive-streams",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.0.4"
      },
      "Purl": "pkg:maven/org.reactivestreams/reactive-streams@1.0.4",
      "Compare": {
        "Hash": "3d6d80fa1297768c005f5b045e9304b6f7ec89d9"
      }
    },
    {
      "Id": "4f615bf0-d4dd-4b3b-bb4b-4046bb458f30",
      "Name": "org.slf4j:jul-to-slf4j",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.7.36"
      },
      "Purl": "pkg:maven/org.slf4j/jul-to-slf4j@1.7.36",
      "Compare": {
        "Hash": "98286222932fbd17ba81f6e0cf45b37044e66204"
      }
    },
    {
      "Id": "84980ad8-5d6c-495d-bc8d-9855929bcee8",
      "Name": "org.slf4j:slf4j-api",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.7.36"
      },
      "Purl": "pkg:maven/org.slf4j/slf4j-api@1.7.36",
      "Compare": {
        "Hash": "3cfedafda8f1466d12643d0cafb9e9c9ca6b2506"
      }
    },
    {
      "Id": "f738111f-5337-4ebb-a6d5-edde360ed125",
      "Name": "org.springframework.boot:spring-boot-actuator-autoconfigure",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-actuator-autoconfigure@2.7.1",
      "Compare": {
        "Hash": "21c785ee3e14ff89df20965463407294e1f1990b"
      }
    },
    {
      "Id": "b86958fc-a002-41e4-a5f7-87ba612d910d",
      "Name": "org.springframework.boot:spring-boot-actuator",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-actuator@2.7.1",
      "Compare": {
        "Hash": "d747491ef37354f72b5402517042381380220fbd"
      }
    },
    {
      "Id": "900b929e-d6da-4913-aaf1-494a5eacc490",
      "Name": "org.springframework.boot:spring-boot-autoconfigure",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-autoconfigure@2.7.1",
      "Compare": {
        "Hash": "8013934e3e1385f333134011ca3f638e81ff01b1"
      }
    },
    {
      "Id": "4a64b19d-a72e-4bb6-96eb-17ec24ed9ec1",
      "Name": "org.springframework.boot:spring-boot-starter-actuator",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-actuator@2.7.1",
      "Compare": {
        "Hash": "3f9942678a2a32d4fc21a847075aa85fcd6b2e28"
      }
    },
    {
      "Id": "221fa763-5fd0-451b-be96-6a857951c78b",
      "Name": "org.springframework.boot:spring-boot-starter-aop",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-aop@2.7.1",
      "Compare": {
        "Hash": "fcb8b49ac4f67604606ced2ba201e7de24e69c41"
      }
    },
    {
      "Id": "84fb57a5-bb13-4909-b3e6-1fe94c47b24d",
      "Name": "org.springframework.boot:spring-boot-starter-cache",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-cache@2.7.1",
      "Compare": {
        "Hash": "48fb7b16392d74a30dfbfa987b1ca0f99e3e3b55"
      }
    },
    {
      "Id": "e6b975be-b329-4476-98b4-06dfc31a8c96",
      "Name": "org.springframework.boot:spring-boot-starter-data-jpa",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-data-jpa@2.7.1",
      "Compare": {
        "Hash": "d20921d126ce0f5cab03b08e3e4706d9f527d9fc"
      }
    },
    {
      "Id": "06ed1187-8627-4711-9c1f-f05e7e32595e",
      "Name": "org.springframework.boot:spring-boot-starter-jdbc",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-jdbc@2.7.1",
      "Compare": {
        "Hash": "132781f31c9ea8bc009fe9eb1f24eb3de340a2aa"
      }
    },
    {
      "Id": "1d2faed0-42c1-46cd-804e-f62b57285d94",
      "Name": "org.springframework.boot:spring-boot-starter-json",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-json@2.7.1",
      "Compare": {
        "Hash": "cdfa703ace2454e3514d3c4b9484581c0da771cd"
      }
    },
    {
      "Id": "485e81f5-29ba-47e7-97c5-2915181afbcd",
      "Name": "org.springframework.boot:spring-boot-starter-logging",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-logging@2.7.1",
      "Compare": {
        "Hash": "4c3b943e248755421c9e79b14d0f8be4beeb88e7"
      }
    },
    {
      "Id": "7a75e814-9d3b-4368-8265-0c3bc62dff4e",
      "Name": "org.springframework.boot:spring-boot-starter-thymeleaf",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-thymeleaf@2.7.1",
      "Compare": {
        "Hash": "9ad5dedd65a5fc96ebbb52bbec0d0aab00479bc6"
      }
    },
    {
      "Id": "deda5c80-1e4c-44ae-80e5-79cb3a6d2129",
      "Name": "org.springframework.boot:spring-boot-starter-tomcat",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-tomcat@2.7.1",
      "Compare": {
        "Hash": "5c6bbf4952d7377ff65cd22f0302b173af0f0933"
      }
    },
    {
      "Id": "f741f657-134f-4750-b8ca-106a1c03c027",
      "Name": "org.springframework.boot:spring-boot-starter-validation",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-validation@2.7.1",
      "Compare": {
        "Hash": "4c86a0ff2ec6a83a5eb7220678a99a0c7bb70474"
      }
    },
    {
      "Id": "0091efcd-e66b-4e0f-8db4-32c1e4ff7ad8",
      "Name": "org.springframework.boot:spring-boot-starter-web",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter-web@2.7.1",
      "Compare": {
        "Hash": "61561273b91bdf982e64917950a46ac59db044ba"
      }
    },
    {
      "Id": "4c343774-29d0-4499-9ad6-0b259162f2f2",
      "Name": "org.springframework.boot:spring-boot-starter",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot-starter@2.7.1",
      "Compare": {
        "Hash": "38f6a95ecaab5dda673f71875df1b4ebdf48f990"
      }
    },
    {
      "Id": "5ceb92d4-b375-4de3-a86a-8f8b3e73f4b7",
      "Name": "org.springframework.boot:spring-boot",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98509395
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.boot/spring-boot@2.7.1",
      "Compare": {
        "Hash": "cd855cb27370b3804dd0833335c25502e1aa47fb"
      }
    },
    {
      "Id": "6db742c5-4283-42d9-85bd-605d5cf9eba6",
      "Name": "org.springframework.cloud:spring-cloud-function-adapter-aws",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.0.2.RELEASE"
      },
      "Purl": "pkg:maven/org.springframework.cloud/spring-cloud-function-adapter-aws@1.0.2.RELEASE",
      "Compare": {
        "Hash": "82dd9726fa29f60b6393b9e8ec3d2511a807df02"
      }
    },
    {
      "Id": "c0c8307b-06b4-4c37-b945-bf23ed885f69",
      "Name": "org.springframework.cloud:spring-cloud-function-context",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.0.2.RELEASE"
      },
      "Purl": "pkg:maven/org.springframework.cloud/spring-cloud-function-context@1.0.2.RELEASE",
      "Compare": {
        "Hash": "619ccfa7f6afcd4e447d3917ad628f294c19a98b"
      }
    },
    {
      "Id": "09c2e4e0-ba53-4404-bc6c-4d062890555f",
      "Name": "org.springframework.cloud:spring-cloud-function-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.0.2.RELEASE"
      },
      "Purl": "pkg:maven/org.springframework.cloud/spring-cloud-function-core@1.0.2.RELEASE",
      "Compare": {
        "Hash": "4705aab6ea62ac039929c996a68296cf5f048b79"
      }
    },
    {
      "Id": "f8a4b2c8-1f9a-4f49-9d76-8136b13f46dd",
      "Name": "org.springframework.data:spring-data-commons",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.data/spring-data-commons@2.7.1",
      "Compare": {
        "Hash": "24f12229b0313efe7cdcb0d8e9a47f7851b188e3"
      }
    },
    {
      "Id": "51444558-075e-4248-9e48-222fa1a0f40b",
      "Name": "org.springframework.data:spring-data-jpa",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.7.1"
      },
      "Purl": "pkg:maven/org.springframework.data/spring-data-jpa@2.7.1",
      "Compare": {
        "Hash": "29ca2103eddfcfd9a98d0ef79b3309d99063a954"
      }
    },
    {
      "Id": "a659c713-7b3f-4faa-a991-7b01310a5987",
      "Name": "org.springframework.samples:spring-petclinic",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "2.7.0-SNAPSHOT"
      },
      "Purl": "pkg:maven/org.springframework.samples/spring-petclinic@2.7.0-SNAPSHOT",
      "Compare": {
        "Hash": "4815a75e3b90b51976cf19fe34c7c050d9e810f7"
      }
    },
    {
      "Id": "7c12feed-53d7-44fc-8cc5-02032816a355",
      "Name": "org.springframework:spring-aop",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-aop@5.3.21",
      "Compare": {
        "Hash": "d12b29a83ea2f617b0ca5af0115c930f7d8aaddf"
      }
    },
    {
      "Id": "ba201aee-84b7-4c18-80b0-2216596f4fb1",
      "Name": "org.springframework:spring-aspects",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-aspects@5.3.21",
      "Compare": {
        "Hash": "ddbe784a866945dcdd257b8012de2cd53ab59b6f"
      }
    },
    {
      "Id": "7f339d64-f9b8-40a8-b3ba-a38816bea125",
      "Name": "org.springframework:spring-beans",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-beans@5.3.21",
      "Compare": {
        "Hash": "57001ceec828910e3045869fce890d2845d707aa"
      }
    },
    {
      "Id": "5fc4dd93-3a69-455e-a557-38175d2855c5",
      "Name": "org.springframework:spring-context-support",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-context-support@5.3.21",
      "Compare": {
        "Hash": "95cfa556e44087d2a0e12582bb918003232695a1"
      }
    },
    {
      "Id": "cf7d5c64-dfa1-471f-8b57-ebe1ce7dddc0",
      "Name": "org.springframework:spring-context",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-context@5.3.21",
      "Compare": {
        "Hash": "b6aca1972a5b64d1a777ca26917d9254549b8735"
      }
    },
    {
      "Id": "efe99a55-b7eb-4bf5-8024-b82df10e68f2",
      "Name": "org.springframework:spring-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-core@5.3.21",
      "Compare": {
        "Hash": "cb1994b583e8a618b292e80f9d7b4f57cfd382e9"
      }
    },
    {
      "Id": "b076eb9e-ae9c-4597-906a-8e6e8d901d10",
      "Name": "org.springframework:spring-expression",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-expression@5.3.21",
      "Compare": {
        "Hash": "cb72ff87798d9359cfdc2b1485da2de11e768463"
      }
    },
    {
      "Id": "f5a64733-8ad6-4908-9c1c-2d773e093df5",
      "Name": "org.springframework:spring-jcl",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-jcl@5.3.21",
      "Compare": {
        "Hash": "2aad8c6c14df67c36b81b8a692eef7811cddbc46"
      }
    },
    {
      "Id": "5f9d138b-c974-4175-8273-7212ffa76497",
      "Name": "org.springframework:spring-jdbc",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-jdbc@5.3.21",
      "Compare": {
        "Hash": "9756f590f176c70fc706be4b17d5e6262a07579b"
      }
    },
    {
      "Id": "4feaa549-fd7f-4d80-8a1b-04975799d281",
      "Name": "org.springframework:spring-messaging",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-messaging@5.3.21",
      "Compare": {
        "Hash": "0f9ddb4537fef5fb3bef79c68691d6dacda445bd"
      }
    },
    {
      "Id": "8555539b-7bab-4d94-a966-b566c6c93207",
      "Name": "org.springframework:spring-orm",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-orm@5.3.21",
      "Compare": {
        "Hash": "1cbf17bccae109783fa00d2f58e3654003c577cd"
      }
    },
    {
      "Id": "a61f12d0-3314-4ddb-840f-b759a6b63bf7",
      "Name": "org.springframework:spring-tx",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-tx@5.3.21",
      "Compare": {
        "Hash": "5c94e21d021158492b98292fdb77b864b0c22285"
      }
    },
    {
      "Id": "384a7a6e-8e8b-49aa-866e-01ea758285e8",
      "Name": "org.springframework:spring-web",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-web@5.3.21",
      "Compare": {
        "Hash": "a030c55711cabfed9bc1b91d1df0e2943618a418"
      }
    },
    {
      "Id": "cb46010e-90db-4d8c-bf9a-1981dede1814",
      "Name": "org.springframework:spring-webmvc",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "license.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.98574203
            },
            {
              "Name": "BSD-3-Clause",
              "Confidence": 0.9306931
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.9000649
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "5.3.21"
      },
      "Purl": "pkg:maven/org.springframework/spring-webmvc@5.3.21",
      "Compare": {
        "Hash": "5fcc6747069f04a989a2b7d201775e2e6dd8d0ac"
      }
    },
    {
      "Id": "10a5e18a-8255-4c1b-b79d-296430da8691",
      "Name": "org.thymeleaf.extras:thymeleaf-extras-java8time",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "3.0.4.RELEASE"
      },
      "Purl": "pkg:maven/org.thymeleaf.extras/thymeleaf-extras-java8time@3.0.4.RELEASE",
      "Compare": {
        "Hash": "1dcdec1aaa992c3c463206c58f12712bacd0f660"
      }
    },
    {
      "Id": "743698bb-ecfe-425d-8737-39ac1a6070d2",
      "Name": "org.thymeleaf:thymeleaf-spring5",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "3.0.15.RELEASE"
      },
      "Purl": "pkg:maven/org.thymeleaf/thymeleaf-spring5@3.0.15.RELEASE",
      "Compare": {
        "Hash": "1e3d5d29f3034b05b7c38446a25a887fd3d45756"
      }
    },
    {
      "Id": "14def45f-5aed-49d4-8b6f-7e02fbec801f",
      "Name": "org.thymeleaf:thymeleaf",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "3.0.15.RELEASE"
      },
      "Purl": "pkg:maven/org.thymeleaf/thymeleaf@3.0.15.RELEASE",
      "Compare": {
        "Hash": "8fef5c9f96070b2e011c6ba75016579035273575"
      }
    },
    {
      "Id": "cca005e7-cc94-4a34-bb20-778dcfe0443c",
      "Name": "org.unbescape:unbescape",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "LicenseFiles": [
        {
          "File": "LICENSE.txt",
          "LicensesInfo": [
            {
              "Name": "Apache-2.0",
              "Confidence": 0.9876943
            },
            {
              "Name": "ECL-2.0",
              "Confidence": 0.90077823
            }
          ]
        }
      ],
      "Version": {
        "Type": "maven",
        "Version": "1.1.6.RELEASE"
      },
      "Purl": "pkg:maven/org.unbescape/unbescape@1.1.6.RELEASE",
      "Compare": {
        "Hash": "b3e0af951a1796d11cc904256c34ecb67a5e3b2a"
      }
    },
    {
      "Id": "5aeac3b1-e877-46df-bc77-6ff8e901f65b",
      "Name": "org.webjars.npm:bootstrap",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "5.1.3"
      },
      "Purl": "pkg:maven/org.webjars.npm/bootstrap@5.1.3",
      "Compare": {
        "Hash": "c8d144eac454c3cc98dae3efdb7cf4c7d6531bf0"
      }
    },
    {
      "Id": "4d9be696-162b-4b97-9e00-f99e47db6c15",
      "Name": "org.webjars.npm:font-awesome",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "4.7.0"
      },
      "Purl": "pkg:maven/org.webjars.npm/font-awesome@4.7.0",
      "Compare": {
        "Hash": "eed9691de9f27fbba33ca1523466fdd178edfebb"
      }
    },
    {
      "Id": "9158bdc7-6dad-45fe-b4e4-c1dbec95c479",
      "Name": "org.webjars:webjars-locator-core",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "0.50"
      },
      "Purl": "pkg:maven/org.webjars/webjars-locator-core@0.50",
      "Compare": {
        "Hash": "4a0613b36ffee6d3242ac94c466113bf0c922eeb"
      }
    },
    {
      "Id": "5ca8c53c-ee09-4020-94e9-594658dcfa4d",
      "Name": "org.yaml:snakeyaml",
      "Type": "maven",
      "Class": "pkg",
      "Language": "java",
      "Version": {
        "Type": "maven",
        "Version": "1.30"
      },
      "Purl": "pkg:maven/org.yaml/snakeyaml@1.30",
      "Compare": {
        "Hash": "ed4664aeaa823404041d3eba6d30ec9543388432"
      }
    }
  ],
  "Identities": [
    {
      "Id": "799cf7aa-f78b-4b2f-8891-e7290fb521ac",
      "Info": {
        "Name": "Ryoji Betchaku",
        "Email": "ryobet@Ryojis-MacBook-Pro.local"
      },
      "Compare": {
        "Hash": "a1dbbae240d86d0c1b56753b22d2861c6efe5722"
      }
    },
    {
      "Id": "48ad37fe-cd5d-47f8-91f1-f2b3d3add4e2",
      "Info": {
        "Name": "Fabian Muscariello",
        "Email": "nroi@mailbox.org"
      },
      "Compare": {
        "Hash": "3c92f04eca000e72db258d1438ca85f616dc9d0d"
      }
    },
    {
      "Id": "0aa435a1-8597-45eb-8eb9-58172f90c9e4",
      "Info": {
        "Name": "Dave Syer",
        "Email": "david_syer@hotmail.com"
      },
      "Compare": {
        "Hash": "3c56cd1bfc3c3ceca6a1fca49430e652f4fb7bb5"
      }
    },
    {
      "Id": "2d39f701-b828-4c45-8034-4e700fe67cb6",
      "Info": {
        "Name": "Dave Syer",
        "Email": "dsyer@vmware.com"
      },
      "Compare": {
        "Hash": "02f1c706ec277b5b8c5fe88b9ddaa5a602820e37"
      }
    },
    {
      "Id": "a1e2f2cc-5ca3-46f4-9b58-cd0cb150675a",
      "Info": {
        "Name": "Dave Syer",
        "Email": "dsyer@pivotal.io"
      },
      "Compare": {
        "Hash": "02d92c1242b5589b2d4de371a7964917b0258901"
      }
    },
    {
      "Id": "6ecf74fa-30fd-4f54-ac88-c94c0674fc3d",
      "Info": {
        "Name": "Stephane Nicoll",
        "Email": "snicoll@pivotal.io"
      },
      "Compare": {
        "Hash": "524e213e0df3028f50226fad75912876bd3276e6"
      }
    },
    {
      "Id": "f2c9b673-7c03-4924-bcf7-dc4c572e58a2",
      "Info": {
        "Name": "Henri Tremblay",
        "Email": "henri.tremblay@gmail.com"
      },
      "Compare": {
        "Hash": "d98ee69823b8d7a981eb56e1b3e98548b37837c3"
      }
    }
  ],
  "Repositories": [
    {
      "Id": "dad5098a-8f30-47aa-a4b3-cbebe04346f9",
      "Info": {
        "Kind": "git",
        "Location": "https://github.com/ryoji-lacework/spring-petclinic.git",
        "Branch": "main",
        "Revision": "dc1bc0dbfeb3e080b30f9168380587e83856a81e",
        "Name": "Ryoji Betchaku",
        "Email": "ryobet@Ryojis-MacBook-Pro.local",
        "Timestamp": "2024-03-01T13:53:40-05:00",
        "DefaultBranch": "main"
      },
      "Edits": [
        {
          "Id": "37544b5d-ada4-4e7b-86d2-cfb5729cdd4e",
          "Info": {
            "Time": "2022-07-04T16:12:36-04:00",
            "Revision": "cbbcef0dcb5298874c482106cbb40afe8c7500eb",
            "Signature": "unsigned"
          },
          "AuthorId": "799cf7aa-f78b-4b2f-8891-e7290fb521ac"
        },
        {
          "Id": "73879309-065c-4906-bd85-c44495ae28f1",
          "Info": {
            "Time": "2021-12-07T11:55:01-05:00",
            "Revision": "ce626da705302e71771b7e22429d1cc3209e7ebb",
            "Signature": "unsigned"
          },
          "AuthorId": "48ad37fe-cd5d-47f8-91f1-f2b3d3add4e2",
          "CommitterId": "0aa435a1-8597-45eb-8eb9-58172f90c9e4"
        },
        {
          "Id": "c8a3b5b6-14a9-4c36-bd82-e3996011943c",
          "Info": {
            "Time": "2021-11-24T06:15:44-05:00",
            "Revision": "83e074940b23ae4fd35e67e20b94a8e4c46687c3",
            "Signature": "unsigned"
          },
          "AuthorId": "2d39f701-b828-4c45-8034-4e700fe67cb6"
        },
        {
          "Id": "6ee89cd0-3be8-4038-bae3-e8b6dd7c0569",
          "Info": {
            "Time": "2016-11-10T12:22:02-05:00",
            "Revision": "e38a9feebe1814ada460dea50ba45f11389fdc9f",
            "Signature": "unsigned"
          },
          "AuthorId": "a1e2f2cc-5ca3-46f4-9b58-cd0cb150675a"
        },
        {
          "Id": "ca511f68-34e0-486c-8c98-a5f33cfb921d",
          "Info": {
            "Time": "2020-05-02T01:51:21-04:00",
            "Revision": "d9f37ece5c865ded91b6582828142ccc33e9d54f",
            "Signature": "unsigned"
          },
          "AuthorId": "6ecf74fa-30fd-4f54-ac88-c94c0674fc3d"
        },
        {
          "Id": "3082a8c0-ea3d-491e-8516-649dfdc04e30",
          "Info": {
            "Time": "2022-07-04T12:29:42-04:00",
            "Revision": "e00c5aa2f60a15455a44754b31218003cc243d5c",
            "Signature": "unsigned"
          },
          "AuthorId": "799cf7aa-f78b-4b2f-8891-e7290fb521ac"
        },
        {
          "Id": "2a22a2d2-43d9-445c-95d8-36ad33fb5ca6",
          "Info": {
            "Time": "2018-02-21T04:48:01-05:00",
            "Revision": "cdd802eeee36f8083580a6cd0368b007cb4a0bad",
            "Signature": "unsigned"
          },
          "AuthorId": "6ecf74fa-30fd-4f54-ac88-c94c0674fc3d"
        },
        {
          "Id": "6c93fef0-7029-40f4-9e3b-2562a1ce31bd",
          "Info": {
            "Time": "2021-11-24T02:48:14-05:00",
            "Revision": "1095a15f0e42cf5ebf0df942022c62fcf4c82e86",
            "Signature": "unsigned"
          },
          "AuthorId": "2d39f701-b828-4c45-8034-4e700fe67cb6",
          "CommitterId": "0aa435a1-8597-45eb-8eb9-58172f90c9e4"
        },
        {
          "Id": "509eae90-4d48-4328-b0a3-ec66c0e15ab2",
          "Info": {
            "Time": "2020-03-20T13:27:18-04:00",
            "Revision": "c0847b7571e58a18333addaa691691edebb7491c",
            "Signature": "unsigned"
          },
          "AuthorId": "6ecf74fa-30fd-4f54-ac88-c94c0674fc3d"
        },
        {
          "Id": "6ada244c-d5ec-4915-80a6-7888a84b9036",
          "Info": {
            "Time": "2017-02-17T06:22:26-05:00",
            "Revision": "443d35eae23c874ed38305fbe75216339c41beaf",
            "Signature": "unsigned"
          },
          "AuthorId": "f2c9b673-7c03-4924-bcf7-dc4c572e58a2"
        }
      ],
      "Compare": {
        "Hash": "8db19b8959df39a78b1b7d4da834531e53510eaa"
      }
    }
  ],
  "Vulnerabilities": [
    {
      "Id": "c2e3e832-2f3a-4e00-acc2-5a7366c32e85",
      "AffectedArtifactIds": [
        "09c2e4e0-ba53-4404-bc6c-4d062890555f",
        "c0c8307b-06b4-4c37-b945-bf23ed885f69"
      ],
      "FixedBy": [
        "9a366d29-5229-480f-98f0-4edd69fa9cb6",
        "624b57e0-db18-4fe5-b996-37a48b7e3198"
      ],
      "Info": {
        "ExternalId": "CVE-2022-22963",
        "Description": "In Spring Cloud Function versions 3.1.6, 3.2.2 and older unsupported versions, when using routing functionality it is possible for a user to provide a specially crafted SpEL as a routing-expression that may result in remote code execution and access to local resources.",
        "Status": "vulnerable",
        "Severity": "critical",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-22963",
        "FixVersion": {
          "Type": "maven",
          "Version": "3.2.3"
        },
        "CVSSv2": {
          "PublishedDateTime": "2022-04-01T23:15:00Z",
          "Score": 7.5,
          "Vectors": "AV:N/AC:L/Au:N/C:P/I:P/A:P",
          "Metrics": {
            "Exploitability": {
              "AccessVector": "Network",
              "AccessComplexity": "Low",
              "Authentication": "None"
            },
            "Impact": {
              "Confidentiality": "Partial",
              "Integrity": "Partial",
              "Availability": "Partial"
            }
          }
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 5.9,
          "Score": 9.8,
          "Vectors": "CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:H/I:H/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "7ab1ee6ddaf9141b352a609abe4fcb72c1b77d63"
      }
    },
    {
      "Id": "7852eb1c-6a73-4f72-88a3-7eb031ccec63",
      "AffectedArtifactIds": [
        "11c20fe7-0461-4940-b213-fb9fe3e63ddf"
      ],
      "FixedBy": [
        "67d55d07-fc1e-4ac3-877d-f305dcbe68ec"
      ],
      "Info": {
        "ExternalId": "CVE-2022-42004",
        "Description": "In FasterXML jackson-databind before 2.12.7.1 and in 2.13.x before 2.13.4, resource exhaustion can occur because of a lack of a check in BeanDeserializer._deserializeFromArray to prevent use of deeply nested arrays. An application is vulnerable only with certain customized choices for deserialization.",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-42004",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.13.4"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 3.6,
          "Score": 7.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "a2db20a7a3bc16f42a69f251cf4c441a76fd93c7"
      }
    },
    {
      "Id": "1902ddec-d300-4542-a97b-8963f8d772f8",
      "AffectedArtifactIds": [
        "11c20fe7-0461-4940-b213-fb9fe3e63ddf"
      ],
      "FixedBy": [
        "67d55d07-fc1e-4ac3-877d-f305dcbe68ec"
      ],
      "Info": {
        "ExternalId": "CVE-2022-42003",
        "Description": "In FasterXML jackson-databind 2.4.0-rc1 until 2.12.7.1 and in 2.13.x before 2.13.4.2 resource exhaustion can occur because of a lack of a check in primitive value deserializers to avoid deep wrapper array nesting, when the UNWRAP_SINGLE_VALUE_ARRAYS feature is enabled. This was patched in 2.12.7.1, 2.13.4.2, and 2.14.0.",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-42003",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.13.4.2"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 3.6,
          "Score": 7.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "b41f1547e3c2592ed9ba1d4d58e4c5d117b4c51e"
      }
    },
    {
      "Id": "562fc7aa-bca7-4052-8cbd-7a39b2bd3db0",
      "AffectedArtifactIds": [
        "dd8ba96c-d491-462c-851c-74f6910986bd"
      ],
      "FixedBy": [
        "ded43856-8284-4586-a2a8-814ee02018fc"
      ],
      "Info": {
        "ExternalId": "CVE-2023-41080",
        "Description": "URL Redirection to Untrusted Site (`Open Redirect`) vulnerability in FORM authentication feature Apache Tomcat. This issue affects Apache Tomcat: from 11.0.0-M1 through 11.0.0-M10, from 10.1.0-M1 through 10.0.12, from 9.0.0-M1 through 9.0.79 and from 8.5.0 through 8.5.92.\n\nThe vulnerability is limited to the ROOT (default) web application.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-41080",
        "FixVersion": {
          "Type": "maven",
          "Version": "9.0.80"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.8,
          "ImpactScore": 2.7,
          "Score": 6.1,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:R/S:C/C:L/I:L/A:N",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "Required"
            },
            "Scope": "Changed",
            "Impact": {
              "Confidentiality": "Low",
              "Integrity": "Low",
              "Availability": "None"
            }
          }
        }
      },
      "Compare": {
        "Hash": "8c7561f34a46af03a9ecb5e1dc8501aea26c4376"
      }
    },
    {
      "Id": "1f877048-f1b2-42ac-a4a3-1f71d2aa13d8",
      "AffectedArtifactIds": [
        "dd8ba96c-d491-462c-851c-74f6910986bd"
      ],
      "FixedBy": [
        "ded43856-8284-4586-a2a8-814ee02018fc"
      ],
      "Info": {
        "ExternalId": "CVE-2023-44487",
        "Description": "## HTTP/2 Rapid reset attack\nThe HTTP/2 protocol allows clients to indicate to the server that a previous stream should be canceled by sending a RST_STREAM frame. The protocol does not require the client and server to coordinate the cancellation in any way, the client may do it unilaterally. The client may also assume that the cancellation will take effect immediately when the server receives the RST_STREAM frame, before any other data from that TCP connection is processed.\n\nAbuse of this feature is called a Rapid Reset attack because it relies on the ability for an endpoint to send a RST_STREAM frame immediately after sending a request frame, which makes the other endpoint start working and then rapidly resets the request. The request is canceled, but leaves the HTTP/2 connection open. \n\nThe HTTP/2 Rapid Reset attack built on this capability is simple: The client opens a large number of streams at once as in the standard HTTP/2 attack, but rather than waiting for a response to each request stream from the server or proxy, the client cancels each request immediately.\n\nThe ability to reset streams immediately allows each connection to have an indefinite number of requests in flight. By explicitly canceling the requests, the attacker never exceeds the limit on the number of concurrent open streams. The number of in-flight requests is no longer dependent on the round-trip time (RTT), but only on the available network bandwidth.\n\nIn a typical HTTP/2 server implementation, the server will still have to do significant amounts of work for canceled requests, such as allocating new stream data structures, parsing the query and doing header decompression, and mapping the URL to a resource. For reverse proxy implementations, the request may be proxied to the backend server before the RST_STREAM frame is processed. The client on the other hand paid almost no costs for sending the requests. This creates an exploitable cost asymmetry between the server and the client.\n\nMultiple software artifacts implementing HTTP/2 are affected. This advisory was originally ingested from the `swift-nio-http2` repo advisory and their original conent follows.\n\n## swift-nio-http2 specific advisory\nswift-nio-http2 is vulnerable to a denial-of-service vulnerability in which a malicious client can create and then reset a large number of HTTP/2 streams in a short period of time. This causes swift-nio-http2 to commit to a large amount of expensive work which it then throws away, including creating entirely new `Channel`s to serve the traffic. This can easily overwhelm an `EventLoop` and prevent it from making forward progress.\n\nswift-nio-http2 1.28 contains a remediation for this issue that applies reset counter using a sliding window. This constrains the number of stream resets that may occur in a given window of time. Clients violating this limit will have their connections torn down. This allows clients to continue to cancel streams for legitimate reasons, while constraining malicious actors.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-44487",
        "FixVersion": {
          "Type": "maven",
          "Version": "9.0.81"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 3.6,
          "Score": 7.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "50dc427e0600c2b112a2e0cd616b999c5eef3932"
      }
    },
    {
      "Id": "c87af319-8960-4c1a-95de-a337046b4233",
      "AffectedArtifactIds": [
        "dd8ba96c-d491-462c-851c-74f6910986bd"
      ],
      "FixedBy": [
        "ded43856-8284-4586-a2a8-814ee02018fc"
      ],
      "Info": {
        "ExternalId": "CVE-2023-45648",
        "Description": "Improper Input Validation vulnerability in Apache Tomcat.\n\nTomcat from 11.0.0-M1 through 11.0.0-M11, from 10.1.0-M1 through 10.1.13, from 9.0.0-M1 through 9.0.81 and from 8.5.0 through 8.5.93 did not correctly parse HTTP trailer headers. A specially crafted, invalid trailer header could cause Tomcat to treat a single \nrequest as multiple requests leading to the possibility of request smuggling when behind a reverse proxy.\n\nUsers are recommended to upgrade to version 11.0.0-M12 onwards, 10.1.14 onwards, 9.0.81 onwards or 8.5.94 onwards, which fix the issue.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-45648",
        "FixVersion": {
          "Type": "maven",
          "Version": "9.0.81"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 1.4,
          "Score": 5.3,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:N/I:L/A:N",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "Low",
              "Availability": "None"
            }
          }
        }
      },
      "Compare": {
        "Hash": "85afb81fd905e1ae4860a5b9a2661c4f7bac1684"
      }
    },
    {
      "Id": "72397184-97b5-42e4-9c57-0ffea664e8f6",
      "AffectedArtifactIds": [
        "dd8ba96c-d491-462c-851c-74f6910986bd"
      ],
      "FixedBy": [
        "ded43856-8284-4586-a2a8-814ee02018fc"
      ],
      "Info": {
        "ExternalId": "CVE-2023-42795",
        "Description": "Incomplete Cleanup vulnerability in Apache Tomcat.\n\nWhen recycling various internal objects in Apache Tomcat from 11.0.0-M1 through 11.0.0-M11, from 10.1.0-M1 through 10.1.13, from 9.0.0-M1 through 9.0.80 and from 8.5.0 through 8.5.93, an error could cause Tomcat to skip some parts of the recycling process leading to information leaking from the current request/response to the next.\n\nUsers are recommended to upgrade to version 11.0.0-M12 onwards, 10.1.14 onwards, 9.0.81 onwards or 8.5.94 onwards, which fixes the issue.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-42795",
        "FixVersion": {
          "Type": "maven",
          "Version": "9.0.81"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 1.4,
          "Score": 5.3,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:L/I:N/A:N",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "Low",
              "Integrity": "None",
              "Availability": "None"
            }
          }
        }
      },
      "Compare": {
        "Hash": "4f058c7dc13b1824b90e547d8e17efc313a87f37"
      }
    },
    {
      "Id": "ab286d2c-ad4e-452f-8206-aaff39ea03e4",
      "AffectedArtifactIds": [
        "dd8ba96c-d491-462c-851c-74f6910986bd"
      ],
      "FixedBy": [
        "ded43856-8284-4586-a2a8-814ee02018fc"
      ],
      "Info": {
        "ExternalId": "CVE-2023-46589",
        "Description": "Improper Input Validation vulnerability in Apache Tomcat. Tomcat from 11.0.0-M1 through 11.0.0-M10, from 10.1.0-M1 through 10.1.15, from 9.0.0-M1 through 9.0.82, and from 8.5.0 through 8.5.95 did not correctly parse HTTP trailer headers. A trailer header that exceeded the header size limit could cause Tomcat to treat a single request as multiple requests leading to the possibility of request smuggling when behind a reverse proxy.\n\nUsers are recommended to upgrade to version 11.0.0-M11 onwards, 10.1.16 onwards, 9.0.83 onwards or 8.5.96 onwards, which fix the issue.",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-46589",
        "FixVersion": {
          "Type": "maven",
          "Version": "9.0.83"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 3.6,
          "Score": 7.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:N/I:H/A:N",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "High",
              "Availability": "None"
            }
          }
        }
      },
      "Compare": {
        "Hash": "6a59aec7c13ea6e0622eee842a6ffb308ff9f569"
      }
    },
    {
      "Id": "c7d02c17-184d-4ff0-aedf-e5cc648736ed",
      "AffectedArtifactIds": [
        "dd8ba96c-d491-462c-851c-74f6910986bd"
      ],
      "FixedBy": [
        "ded43856-8284-4586-a2a8-814ee02018fc"
      ],
      "Info": {
        "ExternalId": "CVE-2024-24549",
        "Description": "Denial of Service due to improper input validation vulnerability for HTTP/2 requests in Apache Tomcat. When processing an HTTP/2 request, if the request exceeded any of the configured limits for headers, the associated HTTP/2 stream was not reset until after all of the headers had been processed.This issue affects Apache Tomcat: from 11.0.0-M1 through 11.0.0-M16, from 10.1.0-M1 through 10.1.18, from 9.0.0-M1 through 9.0.85, from 8.5.0 through 8.5.98.\n\nUsers are recommended to upgrade to version 11.0.0-M17, 10.1.19, 9.0.86 or 8.5.99 which fix the issue.\n\n",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2024-24549",
        "FixVersion": {
          "Type": "maven",
          "Version": "9.0.86"
        }
      },
      "Compare": {
        "Hash": "1b8fba9f09d784af502456204604fe8a7b022611"
      }
    },
    {
      "Id": "dd443bc9-be3e-40f7-9776-6ac7ead760f7",
      "AffectedArtifactIds": [
        "285a3fbc-4152-42b6-8b12-c2320096fabd"
      ],
      "FixedBy": [
        "210d7e6f-4afe-434e-b0df-796c30de2768"
      ],
      "Info": {
        "ExternalId": "CVE-2021-45046",
        "Description": "# Impact\n\nThe fix to address [CVE-2021-44228](https://nvd.nist.gov/vuln/detail/CVE-2021-44228) in Apache Log4j 2.15.0 was incomplete in certain non-default configurations. This could allow attackers with control over Thread Context Map (MDC) input data when the logging configuration uses a non-default Pattern Layout with either a Context Lookup (for example, $${ctx:loginId}) or a Thread Context Map pattern (%X, %mdc, or %MDC) to craft malicious input data using a JNDI Lookup pattern resulting in a remote code execution (RCE) attack. \n\n## Affected packages\nOnly the `org.apache.logging.log4j:log4j-core` package is directly affected by this vulnerability. The `org.apache.logging.log4j:log4j-api` should be kept at the same version as the `org.apache.logging.log4j:log4j-core` package to ensure compatability if in use.\n\n# Mitigation\n\nLog4j 2.16.0 fixes this issue by removing support for message lookup patterns and disabling JNDI functionality by default. This issue can be mitigated in prior releases (\u003c 2.16.0) by removing the JndiLookup class from the classpath (example: zip -q -d log4j-core-*.jar org/apache/logging/log4j/core/lookup/JndiLookup.class).\n\nLog4j 2.15.0 restricts JNDI LDAP lookups to localhost by default. Note that previous mitigations involving configuration such as to set the system property `log4j2.formatMsgNoLookups` to `true` do NOT mitigate this specific vulnerability.",
        "Status": "vulnerable",
        "Severity": "critical",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-45046",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.16.0"
        },
        "CVSSv2": {
          "PublishedDateTime": "2021-12-14T19:15:07.733Z",
          "Score": 5.1,
          "Vectors": "AV:N/AC:H/Au:N/C:P/I:P/A:P",
          "Metrics": {
            "Exploitability": {
              "AccessVector": "Network",
              "AccessComplexity": "High",
              "Authentication": "None"
            },
            "Impact": {
              "Confidentiality": "Partial",
              "Integrity": "Partial",
              "Availability": "Partial"
            }
          }
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.2,
          "ImpactScore": 6,
          "Score": 9,
          "Vectors": "CVSS:3.1/AV:N/AC:H/PR:N/UI:N/S:C/C:H/I:H/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "High",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Changed",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "5f94038ed2bf39b7c9dbb26ab6df824fc6be30da"
      }
    },
    {
      "Id": "1cc73964-68a7-4358-afb3-ae086c87cbb8",
      "AffectedArtifactIds": [
        "285a3fbc-4152-42b6-8b12-c2320096fabd"
      ],
      "FixedBy": [
        "210d7e6f-4afe-434e-b0df-796c30de2768"
      ],
      "Info": {
        "ExternalId": "CVE-2021-45105",
        "Description": "Apache Log4j2 versions 2.0-alpha1 through 2.16.0 (excluding 2.12.3) did not protect from uncontrolled recursion from self-referential lookups. This allows an attacker with control over Thread Context Map data to cause a denial of service when a crafted string is interpreted. This issue was fixed in Log4j 2.17.0 and 2.12.3.\n\n\n# Affected packages\nOnly the `org.apache.logging.log4j:log4j-core` package is directly affected by this vulnerability. The `org.apache.logging.log4j:log4j-api` should be kept at the same version as the `org.apache.logging.log4j:log4j-core` package to ensure compatability if in use.",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-45105",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.17.0"
        },
        "CVSSv2": {
          "PublishedDateTime": "2021-12-18T12:15:07.433Z",
          "Score": 4.3,
          "Vectors": "AV:N/AC:M/Au:N/C:N/I:N/A:P",
          "Metrics": {
            "Exploitability": {
              "AccessVector": "Network",
              "AccessComplexity": "Medium",
              "Authentication": "None"
            },
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "Partial"
            }
          }
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.2,
          "ImpactScore": 3.6,
          "Score": 5.9,
          "Vectors": "CVSS:3.1/AV:N/AC:H/PR:N/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "High",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "3177e1ab1be67d7dd4c824a127b12bf9a6356781"
      }
    },
    {
      "Id": "c51ac2af-52c5-454c-aabe-f59d6bfb5cbe",
      "AffectedArtifactIds": [
        "285a3fbc-4152-42b6-8b12-c2320096fabd"
      ],
      "FixedBy": [
        "210d7e6f-4afe-434e-b0df-796c30de2768"
      ],
      "Info": {
        "ExternalId": "CVE-2021-44832",
        "Description": "Apache Log4j2 versions 2.0-beta7 through 2.17.0 (excluding security fix releases 2.3.2 and 2.12.4) are vulnerable to an attack where an attacker with permission to modify the logging configuration file can construct a malicious configuration using a JDBC Appender with a data source referencing a JNDI URI which can execute remote code. This issue is fixed by limiting JNDI data source names to the java protocol in Log4j2 versions 2.17.1, 2.12.4, and 2.3.2.\n\n\n# Affected packages\nOnly the `org.apache.logging.log4j:log4j-core` package is directly affected by this vulnerability. The `org.apache.logging.log4j:log4j-api` should be kept at the same version as the `org.apache.logging.log4j:log4j-core` package to ensure compatability if in use.\n\nThis issue does not impact default configurations of Log4j2 and requires an attacker to have control over the Log4j2 configuration, which reduces the likelihood of being exploited.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-44832",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.17.1"
        },
        "CVSSv2": {
          "PublishedDateTime": "2021-12-28T20:15:08.4Z",
          "Score": 8.5,
          "Vectors": "AV:N/AC:M/Au:S/C:C/I:C/A:C",
          "Metrics": {
            "Exploitability": {
              "AccessVector": "Network",
              "AccessComplexity": "Medium",
              "Authentication": "Single"
            },
            "Impact": {
              "Confidentiality": "Complete",
              "Integrity": "Complete",
              "Availability": "Complete"
            }
          }
        },
        "CVSSv3": {
          "ExploitabilityScore": 0.7,
          "ImpactScore": 5.9,
          "Score": 6.6,
          "Vectors": "CVSS:3.1/AV:N/AC:H/PR:H/UI:N/S:U/C:H/I:H/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "High",
              "PrivilegesRequired": "High",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "0daeb1f7b77fd75f02d7dc981a09292e4578d64f"
      }
    },
    {
      "Id": "c5920afe-1600-4e9e-a4bc-0f26062c1d75",
      "AffectedArtifactIds": [
        "fc3e2bbe-f17e-44a8-a727-16c745163862"
      ],
      "FixedBy": [
        "28d61623-b000-46d2-9ea0-042cec1c9b28"
      ],
      "Info": {
        "ExternalId": "CVE-2022-45868",
        "Description": "The web-based admin console in H2 Database Engine through 2.1.214 can be started via the CLI with the argument -webAdminPassword, which allows the user to specify the password in cleartext for the web admin console. Consequently, a local user (or an attacker that has obtained local access through some means) would be able to discover the password by listing processes and their arguments. NOTE: the vendor states \\This is not a vulnerability of H2 Console ... Passwords should never be passed on the command line and every qualified DBA or system administrator is expected to know that.\\",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-45868",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.2.220"
        },
        "CVSSv3": {
          "ExploitabilityScore": 1.8,
          "ImpactScore": 5.9,
          "Score": 7.8,
          "Vectors": "CVSS:3.1/AV:L/AC:L/PR:L/UI:N/S:U/C:H/I:H/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Local",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "Low",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "674b728bbf0d0cc0483f34b5b75391a94dfd4a3f"
      }
    },
    {
      "Id": "be4a301c-e6ca-477b-bd31-799131e74ee6",
      "AffectedArtifactIds": [
        "5ceb92d4-b375-4de3-a86a-8f8b3e73f4b7"
      ],
      "FixedBy": [
        "f090854e-7965-45a2-ae46-940f3c9fc8a9"
      ],
      "Info": {
        "ExternalId": "CVE-2023-34055",
        "Description": "In Spring Boot versions 2.7.0 - 2.7.17, 3.0.0-3.0.12 and 3.1.0-3.1.5, it is possible for a user to provide specially crafted HTTP requests that may cause a denial-of-service (DoS) condition.\n\nSpecifically, an application is vulnerable when all of the following are true:\n\n  *  the application uses Spring MVC or Spring WebFlux\n  *  org.springframework.boot:spring-boot-actuator is on the classpath",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-34055",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.7.18"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.8,
          "ImpactScore": 3.6,
          "Score": 6.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "Low",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "60768ad9233f2a59f96b062cd014e475c90df087"
      }
    },
    {
      "Id": "012f7d86-7b0a-4d0a-8e1f-fa79bac945c4",
      "AffectedArtifactIds": [
        "9b96826a-5676-43ea-81b5-c44dc3473643"
      ],
      "FixedBy": [
        "2bf21d1f-496d-454b-a7a6-7caf7167625f"
      ],
      "Info": {
        "ExternalId": "CVE-2022-31197",
        "Description": "### Impact\n_What kind of vulnerability is it? Who is impacted?_\n\nThe PGJDBC implementation of the `java.sql.ResultRow.refreshRow()` method is not performing escaping of column names so a malicious column name that contains a statement terminator, e.g. `;`, could lead to SQL injection. This could lead to executing additional SQL commands as the application`s JDBC user.\n\nUser applications that do not invoke the `ResultSet.refreshRow()` method are not impacted.\n\nUser application that do invoke that method are impacted if the underlying database that they are querying via their JDBC application may be under the control of an attacker. The attack requires the attacker to trick the user into executing SQL against a table name who`s column names would contain the malicious SQL and subsequently invoke the `refreshRow()` method on the ResultSet.\n\nFor example:\n\n```sql\nCREATE TABLE refresh_row_example (\n  id     int PRIMARY KEY,\n  \\1 FROM refresh_row_example; SELECT pg_sleep(10); SELECT * \\ int\n);\n```\n\nThis example has a table with two columns. The name of the second column is crafted to contain a statement terminator followed by additional SQL. Invoking the `ResultSet.refreshRow()` on a ResultSet that queried this table, e.g. `SELECT * FROM refresh_row`, would cause the additional SQL commands such as the `SELECT pg_sleep(10)` invocation to be executed.\n\nAs the multi statement command would contain multiple results, it would not be possible for the attacker to get data directly out of this approach as the `ResultSet.refreshRow()` method would throw an exception. However, the attacker could execute any arbitrary SQL including inserting the data into another table that could then be read or any other DML / DDL statement.\n\nNote that the application`s JDBC user and the schema owner need not be the same. A JDBC application that executes as a privileged user querying database schemas owned by potentially malicious less-privileged users would be vulnerable. In that situation it may be possible for the malicious user to craft a schema that causes the application to execute commands as the privileged user.\n\n### Patches\n_Has the problem been patched? What versions should users upgrade to?_\n\nYes, versions 42.2.26, 42.3.7, and 42.4.1 have been released with a fix.\n\n### Workarounds\n_Is there a way for users to fix or remediate the vulnerability without upgrading?_\n\nCheck that you are not using the `ResultSet.refreshRow()` method.\n\nIf you are, ensure that the code that executes that method does not connect to a database that is controlled by an unauthenticated or malicious user. If your application only connects to its own database with a fixed schema with no DDL permissions, then you will not be affected by this vulnerability as it requires a maliciously crafted schema.\n",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-31197",
        "FixVersion": {
          "Type": "maven",
          "Version": "42.3.7"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.1,
          "ImpactScore": 5.9,
          "Score": 8,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:L/UI:R/S:U/C:H/I:H/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "Low",
              "UserInteraction": "Required"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "56ee21f6e111ad51a859cbce8c593f7877e2f5df"
      }
    },
    {
      "Id": "61aaa82a-cabc-448d-89cf-3f15365b1982",
      "AffectedArtifactIds": [
        "9b96826a-5676-43ea-81b5-c44dc3473643"
      ],
      "FixedBy": [
        "2bf21d1f-496d-454b-a7a6-7caf7167625f"
      ],
      "Info": {
        "ExternalId": "CVE-2022-41946",
        "Description": "**Vulnerability**\n\n`PreparedStatement.setText(int, InputStream)`\nand\n\n`PreparedStatemet.setBytea(int, InputStream)`\n\nwill create a temporary file if the InputStream is larger than 51k\n\n \nExample of vulnerable code:\n\n```java\nString s = \\some very large string greater than 51200 bytes\\;\n\nPreparedStatement.setInputStream(1, new ByteArrayInputStream(s.getBytes()) );\n```\nThis will create a temporary file which is readable by other users on Unix like systems, but not MacOS.\n\nImpact\nOn Unix like systems, the system`s temporary directory is shared between all users on that system. Because of this, when files and directories are written into this directory they are, by default, readable by other users on that same system.\n\nThis vulnerability does not allow other users to overwrite the contents of these directories or files. This is purely an information disclosure vulnerability.\n\nWhen analyzing the impact of this vulnerability, here are the important questions to ask:\n\nIs the driver running in an environment where the OS has other untrusted users.\nIf yes, and you answered `yes` to question 1, this vulnerability impacts you.\nIf no, this vulnerability does not impact you.\"nPatches\"nBecause certain JDK file system APIs were only added in JDK 1.7, this this fix is dependent upon the version of the JDK you are using.\n\nJava 1.8 and higher users: this vulnerability is fixed in 42.2.27, 42.3.8, 42.4.3, 42.5.1\nJava 1.7 users: this vulnerability is fixed in 42.2.27.jre7\nJava 1.6 and lower users: no patch is available; you must use the workaround below.\"nWorkarounds\"nIf you are unable to patch, or are stuck running on Java 1.6, specifying the java.io.tmpdir system environment variable to a directory that is exclusively owned by the executing user will fix this vulnerability.\n\nReferences\n[CWE-200: Exposure of Sensitive Information to an Unauthorized Actor](https://cwe.mitre.org/data/definitions/200.html)\nFix commit https://github.com/pgjdbc/pgjdbc/commit/9008dc9aade6dbfe4efafcd6872ebc55f4699cf5\nSimilar Vulnerabilities\nGoogle Guava - https://github.com/google/guava/issues/4011\nApache Ant - https://nvd.nist.gov/vuln/detail/CVE-2020-1945\nJetBrains Kotlin Compiler - https://nvd.nist.gov/vuln/detail/CVE-2020-15824",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-41946",
        "FixVersion": {
          "Type": "maven",
          "Version": "42.3.8"
        },
        "CVSSv3": {
          "ExploitabilityScore": 1.8,
          "ImpactScore": 3.6,
          "Score": 5.5,
          "Vectors": "CVSS:3.1/AV:L/AC:L/PR:L/UI:N/S:U/C:H/I:N/A:N",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Local",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "Low",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "None",
              "Availability": "None"
            }
          }
        }
      },
      "Compare": {
        "Hash": "330b0eb724bd2b8f2a2e99d1c88b9f125d5c459f"
      }
    },
    {
      "Id": "4c0dbca5-4040-45c3-addb-4bc95d70dbfd",
      "AffectedArtifactIds": [
        "9b96826a-5676-43ea-81b5-c44dc3473643"
      ],
      "FixedBy": [
        "2bf21d1f-496d-454b-a7a6-7caf7167625f"
      ],
      "Info": {
        "ExternalId": "CVE-2024-1597",
        "Description": "# Impact\nSQL injection is possible when using the non-default connection property `preferQueryMode=simple` in combination with application code that has a vulnerable SQL that negates a parameter value.\n\nThere is no vulnerability in the driver when using the default query mode. Users that do not override the query mode are not impacted.\n\n# Exploitation\n\nTo exploit this behavior the following conditions must be met:\n\n1. A placeholder for a numeric value must be immediately preceded by a minus (i.e. `-`)\n1. There must be a second placeholder for a string value after the first placeholder on the same line. \n1. Both parameters must be user controlled.\n\nThe prior behavior of the driver when operating in simple query mode would inline the negative value of the first parameter and cause the resulting line to be treated as a `--` SQL comment. That would extend to the beginning of the next parameter and cause the quoting of that parameter to be consumed by the comment line. If that string parameter includes a newline, the resulting text would appear unescaped in the resulting SQL.\n\nWhen operating in the default extended query mode this would not be an issue as the parameter values are sent separately to the server. Only in simple query mode the parameter values are inlined into the executed SQL causing this issue.\n\n# Example\n\n```java\nPreparedStatement stmt = conn.prepareStatement(\\SELECT -?, ?\\);\nstmt.setInt(1, -1);\nstmt.setString(2, \\\\\nWHERE false --\\);\nResultSet rs = stmt.executeQuery();\n```\n\nThe resulting SQL when operating in simple query mode would be:\n\n```sql\nSELECT --1,`\nWHERE false --`\n```\n\nThe contents of the second parameter get injected into the command. Note how both the number of result columns and the WHERE clause of the command have changed. A more elaborate example could execute arbitrary other SQL commands.\n\n# Patch\nProblem will be patched upgrade to 42.7.2, 42.6.1, 42.5.5, 42.4.4, 42.3.9, 42.2.28, 42.2.28.jre7\n\nThe patch fixes the inlining of parameters by forcing them all to be serialized as wrapped literals. The SQL in the prior example would be transformed into:\n\n```sql\nSELECT -(`-1`::int4), (`\nWHERE false --`)\n```\n\n# Workarounds\nDo not use the connection property`preferQueryMode=simple`. (*NOTE: If you do not explicitly specify a query mode then you are using the default of `extended` and are not impacted by this issue.*)",
        "Status": "vulnerable",
        "Severity": "critical",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2024-1597",
        "FixVersion": {
          "Type": "maven",
          "Version": "42.3.9"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 6,
          "Score": 10,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Changed",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "9b4599713c677050022485cf75e3a62ac1feef6e"
      }
    },
    {
      "Id": "fa5baae7-ee2a-47e9-9655-f2820e15bc9d",
      "AffectedArtifactIds": [
        "900b929e-d6da-4913-aaf1-494a5eacc490"
      ],
      "FixedBy": [
        "961e686b-c2cf-440e-9ed5-6882c90fa193"
      ],
      "Info": {
        "ExternalId": "CVE-2023-20883",
        "Description": "In Spring Boot versions 3.0.0 - 3.0.6, 2.7.0 - 2.7.11, 2.6.0 - 2.6.14, 2.5.0 - 2.5.14 and older unsupported versions, there is potential for a denial-of-service (DoS) attack if Spring MVC is used together with a reverse proxy cache.\n\nSpecifically, an application is vulnerable if all of the conditions are true:\n\n* The application has Spring MVC auto-configuration enabled. This is the case by default if Spring MVC is on the classpath.\n* The application makes use of Spring Boot`s welcome page support, either static or templated.\n* Your application is deployed behind a proxy which caches 404 responses.\n\nYour application is NOT vulnerable if any of the following are true:\n\n* Spring MVC auto-configuration is disabled. This is true if WebMvcAutoConfiguration is explicitly excluded, if Spring MVC is not on the classpath, or if spring.main.web-application-type is set to a value other than SERVLET.\n* The application does not use Spring Boot`s welcome page support.\n* You do not have a proxy which caches 404 responses.\n\n\nAffected Spring Products and Versions\n\nSpring Boot\n\n3.0.0 to 3.0.6 2.7.0 to 2.7.11 2.6.0 to 2.6.14 2.5.0 to 2.5.14\n\nOlder, unsupported versions are also affected\nMitigation\n\nUsers of affected versions should apply the following mitigations:\n\n* 3.0.x users should upgrade to 3.0.7+\n* 2.7.x users should upgrade to 2.7.12+\n* 2.6.x users should upgrade to 2.6.15+\n* 2.5.x users should upgrade to 2.5.15+\n\nUsers of older, unsupported versions should upgrade to 3.0.7+ or 2.7.12+.\n\nWorkarounds: configure the reverse proxy not to cache 404 responses and/or not to cache responses to requests to the root (/) of the application.",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-20883",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.7.12"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 3.6,
          "Score": 7.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "225d6107139a6dc125454f6a1bfaae3fab4561aa"
      }
    },
    {
      "Id": "e356fe89-b57f-49a2-9aab-436afb914459",
      "AffectedArtifactIds": [
        "384a7a6e-8e8b-49aa-866e-01ea758285e8"
      ],
      "FixedBy": [
        "8af3a4f9-8417-4878-892d-643dd02f7cbd"
      ],
      "Info": {
        "ExternalId": "CVE-2024-22243",
        "Description": "Applications that use UriComponentsBuilder to parse an externally provided URL (e.g. through a query parameter) AND perform validation checks on the host of the parsed URL may be vulnerable to a  open redirect attack or to a SSRF attack if the URL is used after passing validation checks.\n",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2024-22243",
        "FixVersion": {
          "Type": "maven",
          "Version": "5.3.32"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.8,
          "ImpactScore": 5.2,
          "Score": 8.1,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:R/S:U/C:H/I:H/A:N",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "Required"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "None"
            }
          }
        }
      },
      "Compare": {
        "Hash": "1439f62c403656fe7aadaefcff474b9466f67e7e"
      }
    },
    {
      "Id": "4eb443ca-2755-4520-b37b-b88dfdbe7819",
      "AffectedArtifactIds": [
        "384a7a6e-8e8b-49aa-866e-01ea758285e8"
      ],
      "FixedBy": [
        "8af3a4f9-8417-4878-892d-643dd02f7cbd"
      ],
      "Info": {
        "ExternalId": "CVE-2016-1000027",
        "Description": "Pivotal Spring Framework before 6.0.0 suffers from a potential remote code execution (RCE) issue if used for Java deserialization of untrusted data. Depending on how the library is implemented within a product, this issue may or not occur, and authentication may be required.\n\nMaintainers recommend investigating alternative components or a potential mitigating control. Version 4.2.6 and 3.2.17 contain [enhanced documentation](https://github.com/spring-projects/spring-framework/commit/5cbe90b2cd91b866a5a9586e460f311860e11cfa) advising users to take precautions against unsafe Java deserialization, version 5.3.0 [deprecate the impacted classes](https://github.com/spring-projects/spring-framework/issues/25379) and version 6.0.0 [removed it entirely](https://github.com/spring-projects/spring-framework/issues/27422).",
        "Status": "vulnerable",
        "Severity": "critical",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2016-1000027",
        "FixVersion": {
          "Type": "maven",
          "Version": "6.0.0"
        },
        "CVSSv2": {
          "PublishedDateTime": "2020-01-02T23:15:11.857Z",
          "Score": 7.5,
          "Vectors": "AV:N/AC:L/Au:N/C:P/I:P/A:P",
          "Metrics": {
            "Exploitability": {
              "AccessVector": "Network",
              "AccessComplexity": "Low",
              "Authentication": "None"
            },
            "Impact": {
              "Confidentiality": "Partial",
              "Integrity": "Partial",
              "Availability": "Partial"
            }
          }
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 5.9,
          "Score": 9.8,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:H/I:H/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "974aa0826366b14264d4f3a39f441b0c545d4ea7"
      }
    },
    {
      "Id": "05e13a09-10d5-48f2-860c-6295690ae23f",
      "AffectedArtifactIds": [
        "143cae9d-a474-4f5a-aba3-1d6f170bfa82",
        "8a7c2688-0814-49eb-8e2d-475548ff8154"
      ],
      "FixedBy": [
        "45346cd0-53b2-4ee5-8a43-6b149c0fee46",
        "0181b9f1-a691-49d7-9b73-f4086cd148d6"
      ],
      "Info": {
        "ExternalId": "CVE-2023-6378",
        "Description": "A serialization vulnerability in logback receiver component part of logback allows an attacker to mount a Denial-Of-Service attack by sending poisoned data.\n\nThis is only exploitable if logback receiver component is deployed. See https://logback.qos.ch/manual/receivers.html",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-6378",
        "FixVersion": {
          "Type": "maven",
          "Version": "1.2.13"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 3.6,
          "Score": 7.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "b8653bdf9cf79a46fdd54119d5886f8efcef6034"
      }
    },
    {
      "Id": "fac5a74b-86a5-4e04-aff4-17dd3ee84a87",
      "AffectedArtifactIds": [
        "5ca8c53c-ee09-4020-94e9-594658dcfa4d"
      ],
      "FixedBy": [
        "4d9f3995-ce8a-4a7a-a483-c97758cd5b2c"
      ],
      "Info": {
        "ExternalId": "CVE-2022-38751",
        "Description": "Using snakeYAML to parse untrusted YAML files may be vulnerable to Denial of Service attacks (DOS). If the parser is running on user supplied input, an attacker may supply content that causes the parser to crash by stackoverflow.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-38751",
        "FixVersion": {
          "Type": "maven",
          "Version": "1.31"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.8,
          "ImpactScore": 3.6,
          "Score": 6.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "Low",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "83afe5b02739dc0fac1d830779e365d27f539156"
      }
    },
    {
      "Id": "e216c954-dc03-4bb0-81b0-968efbb9c7cd",
      "AffectedArtifactIds": [
        "5ca8c53c-ee09-4020-94e9-594658dcfa4d"
      ],
      "FixedBy": [
        "4d9f3995-ce8a-4a7a-a483-c97758cd5b2c"
      ],
      "Info": {
        "ExternalId": "CVE-2022-38749",
        "Description": "Using snakeYAML to parse untrusted YAML files may be vulnerable to Denial of Service attacks (DOS). If the parser is running on user supplied input, an attacker may supply content that causes the parser to crash by stackoverflow.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-38749",
        "FixVersion": {
          "Type": "maven",
          "Version": "1.31"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.8,
          "ImpactScore": 3.6,
          "Score": 6.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "Low",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "8872daf4fe889cd94efdd77ba9f6bd0088fe39b5"
      }
    },
    {
      "Id": "064ebc6e-8f53-4ea8-969a-c16b1d2d2a80",
      "AffectedArtifactIds": [
        "5ca8c53c-ee09-4020-94e9-594658dcfa4d"
      ],
      "FixedBy": [
        "4d9f3995-ce8a-4a7a-a483-c97758cd5b2c"
      ],
      "Info": {
        "ExternalId": "CVE-2022-38750",
        "Description": "Using snakeYAML to parse untrusted YAML files may be vulnerable to Denial of Service attacks (DOS). If the parser is running on user supplied input, an attacker may supply content that causes the parser to crash by stackoverflow.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-38750",
        "FixVersion": {
          "Type": "maven",
          "Version": "1.31"
        },
        "CVSSv3": {
          "ExploitabilityScore": 1.8,
          "ImpactScore": 3.6,
          "Score": 5.5,
          "Vectors": "CVSS:3.1/AV:L/AC:L/PR:N/UI:R/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Local",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "Required"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "345e7e707013ed1394b204283dae250fdbb2958b"
      }
    },
    {
      "Id": "149be9a5-aafc-49b9-86f2-3ac23af082d8",
      "AffectedArtifactIds": [
        "5ca8c53c-ee09-4020-94e9-594658dcfa4d"
      ],
      "FixedBy": [
        "4d9f3995-ce8a-4a7a-a483-c97758cd5b2c"
      ],
      "Info": {
        "ExternalId": "CVE-2022-25857",
        "Description": "The package org.yaml:snakeyaml from 0 and before 1.31 are vulnerable to Denial of Service (DoS) due missing to nested depth limitation for collections.",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-25857",
        "FixVersion": {
          "Type": "maven",
          "Version": "1.31"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 3.6,
          "Score": 7.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "5101ed2c5f565504ea6c244e5be5d52db0e6e44f"
      }
    },
    {
      "Id": "7a80f2ce-6b1e-4983-a8c3-7efcb13bd6a6",
      "AffectedArtifactIds": [
        "5ca8c53c-ee09-4020-94e9-594658dcfa4d"
      ],
      "FixedBy": [
        "4d9f3995-ce8a-4a7a-a483-c97758cd5b2c"
      ],
      "Info": {
        "ExternalId": "CVE-2022-38752",
        "Description": "Using snakeYAML to parse untrusted YAML files may be vulnerable to Denial of Service attacks (DoS). If the parser is running on user supplied input, an attacker may supply content that causes the parser to crash by stack-overflow.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-38752",
        "FixVersion": {
          "Type": "maven",
          "Version": "1.32"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.8,
          "ImpactScore": 3.6,
          "Score": 6.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "Low",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "778ed3cc8844a15f0ed1ef12e0185cdd80cf8e65"
      }
    },
    {
      "Id": "be16991b-b830-4b0f-8de6-645c9d4563f2",
      "AffectedArtifactIds": [
        "5ca8c53c-ee09-4020-94e9-594658dcfa4d"
      ],
      "FixedBy": [
        "4d9f3995-ce8a-4a7a-a483-c97758cd5b2c"
      ],
      "Info": {
        "ExternalId": "CVE-2022-41854",
        "Description": "Those using Snakeyaml to parse untrusted YAML files may be vulnerable to Denial of Service attacks (DOS). If the parser is running on user supplied input, an attacker may supply content that causes the parser to crash by stack overflow. This effect may support a denial of service attack.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-41854",
        "FixVersion": {
          "Type": "maven",
          "Version": "1.32"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.8,
          "ImpactScore": 3.6,
          "Score": 6.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:R/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "Required"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "f669b13f0008cf057771e70f53524689f0f779b8"
      }
    },
    {
      "Id": "08969e81-2456-4613-9888-3a52b4f156db",
      "AffectedArtifactIds": [
        "5ca8c53c-ee09-4020-94e9-594658dcfa4d"
      ],
      "FixedBy": [
        "4d9f3995-ce8a-4a7a-a483-c97758cd5b2c"
      ],
      "Info": {
        "ExternalId": "CVE-2022-1471",
        "Description": "### Summary\nSnakeYaml`s `Constructor` class, which inherits from `SafeConstructor`, allows any type be deserialized given the following line:\n\nnew Yaml(new Constructor(TestDataClass.class)).load(yamlContent);\n\nTypes do not have to match the types of properties in the target class. A `ConstructorException` is thrown, but only after a malicious payload is deserialized.\n\n### Severity\nHigh, lack of type checks during deserialization allows remote code execution.\n\n### Proof of Concept\nExecute `bash run.sh`. The PoC uses Constructor to deserialize a payload\nfor RCE. RCE is demonstrated by using a payload which performs a http request to\nhttp://127.0.0.1:8000.\n\nExample output of successful run of proof of concept:\n\n```\n$ bash run.sh\n\n[+] Downloading snakeyaml if needed\n[+] Starting mock HTTP server on 127.0.0.1:8000 to demonstrate RCE\nnc: no process found\n[+] Compiling and running Proof of Concept, which a payload that sends a HTTP request to mock web server.\n[+] An exception is expected.\nException:\nCannot create property=payload for JavaBean=Main$TestDataClass@3cbbc1e0\n in `string`, line 1, column 1:\n    payload: !!javax.script.ScriptEn ... \n    ^\nCan not set java.lang.String field Main$TestDataClass.payload to javax.script.ScriptEngineManager\n in `string`, line 1, column 10:\n    payload: !!javax.script.ScriptEngineManag ... \n             ^\n\n\\tat org.yaml.snakeyaml.constructor.Constructor$ConstructMapping.constructJavaBean2ndStep(Constructor.java:291)\n\\tat org.yaml.snakeyaml.constructor.Constructor$ConstructMapping.construct(Constructor.java:172)\n\\tat org.yaml.snakeyaml.constructor.Constructor$ConstructYamlObject.construct(Constructor.java:332)\n\\tat org.yaml.snakeyaml.constructor.BaseConstructor.constructObjectNoCheck(BaseConstructor.java:230)\n\\tat org.yaml.snakeyaml.constructor.BaseConstructor.constructObject(BaseConstructor.java:220)\n\\tat org.yaml.snakeyaml.constructor.BaseConstructor.constructDocument(BaseConstructor.java:174)\n\\tat org.yaml.snakeyaml.constructor.BaseConstructor.getSingleData(BaseConstructor.java:158)\n\\tat org.yaml.snakeyaml.Yaml.loadFromReader(Yaml.java:491)\n\\tat org.yaml.snakeyaml.Yaml.load(Yaml.java:416)\n\\tat Main.main(Main.java:37)\nCaused by: java.lang.IllegalArgumentException: Can not set java.lang.String field Main$TestDataClass.payload to javax.script.ScriptEngineManager\n\\tat java.base/jdk.internal.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:167)\n\\tat java.base/jdk.internal.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:171)\n\\tat java.base/jdk.internal.reflect.UnsafeObjectFieldAccessorImpl.set(UnsafeObjectFieldAccessorImpl.java:81)\n\\tat java.base/java.lang.reflect.Field.set(Field.java:780)\n\\tat org.yaml.snakeyaml.introspector.FieldProperty.set(FieldProperty.java:44)\n\\tat org.yaml.snakeyaml.constructor.Constructor$ConstructMapping.constructJavaBean2ndStep(Constructor.java:286)\n\\t... 9 more\n[+] Dumping Received HTTP Request. Will not be empty if PoC worked\nGET /proof-of-concept HTTP/1.1\nUser-Agent: Java/11.0.14\nHost: localhost:8000\nAccept: text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2\nConnection: keep-alive\n```\n\n### Further Analysis\nPotential mitigations include, leveraging SnakeYaml`s SafeConstructor while parsing untrusted content.\n\nSee https://bitbucket.org/snakeyaml/snakeyaml/issues/561/cve-2022-1471-vulnerability-in#comment-64581479 for discussion on the subject.\n\nA fix was released in version 2.0. See https://bitbucket.org/snakeyaml/snakeyaml/issues/561/cve-2022-1471-vulnerability-in#comment-64876314 for more information.\n\n### Timeline\n**Date reported**: 4/11/2022\n**Date fixed**: \n**Date disclosed**: 10/13/2022",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-1471",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.0"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 5.9,
          "Score": 9.8,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:H/I:H/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "ff68c99534e0bfaafb21507a502623f04b5daaa8"
      }
    },
    {
      "Id": "f1e53cb3-3ade-46b7-8c49-275d3544d979",
      "AffectedArtifactIds": [
        "f738111f-5337-4ebb-a6d5-edde360ed125"
      ],
      "FixedBy": [
        "e98c2c53-2bff-43e0-85ec-9c84ddf417ae"
      ],
      "Info": {
        "ExternalId": "CVE-2023-20873",
        "Description": "In Spring Boot versions 3.0.0 - 3.0.5, 2.7.0 - 2.7.10, and older unsupported versions, an application that is deployed to Cloud Foundry could be susceptible to a security bypass. Users of affected versions should apply the following mitigation: 3.0.x users should upgrade to 3.0.6+. 2.7.x users should upgrade to 2.7.11+. Users of older, unsupported versions should upgrade to 3.0.6+ or 2.7.11+.",
        "Status": "vulnerable",
        "Severity": "critical",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-20873",
        "FixVersion": {
          "Type": "maven",
          "Version": "2.7.11"
        },
        "CVSSv3": {
          "ExploitabilityScore": 3.9,
          "ImpactScore": 5.9,
          "Score": 9.8,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:U/C:H/I:H/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "None",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "High",
              "Integrity": "High",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "c2b2470fc209233a850e9d0ba8be82816f42524b"
      }
    },
    {
      "Id": "4cc2eda7-d66a-4045-b383-631d51e04e3b",
      "AffectedArtifactIds": [
        "b076eb9e-ae9c-4597-906a-8e6e8d901d10"
      ],
      "FixedBy": [
        "43814321-c6f0-4cc2-88b7-ff4c45489157"
      ],
      "Info": {
        "ExternalId": "CVE-2023-20861",
        "Description": "In Spring Framework versions 6.0.0 - 6.0.6, 5.3.0 - 5.3.25, 5.2.0.RELEASE - 5.2.22.RELEASE, and older unsupported versions, it is possible for a user to provide a specially crafted SpEL expression that may cause a denial-of-service (DoS) condition.",
        "Status": "vulnerable",
        "Severity": "medium",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-20861",
        "FixVersion": {
          "Type": "maven",
          "Version": "5.3.26"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.8,
          "ImpactScore": 3.6,
          "Score": 6.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "Low",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "a0eafd38597d125d1ab17ccf9970f982f20f865e"
      }
    },
    {
      "Id": "96a3165b-f92f-452a-a233-6b8352f6191e",
      "AffectedArtifactIds": [
        "b076eb9e-ae9c-4597-906a-8e6e8d901d10"
      ],
      "FixedBy": [
        "43814321-c6f0-4cc2-88b7-ff4c45489157"
      ],
      "Info": {
        "ExternalId": "CVE-2023-20863",
        "Description": "In Spring Framework versions prior to 5.2.24.release+ , 5.3.27+ and 6.0.8+ , it is possible for a user to provide a specially crafted Spring Expression Language (SpEL) expression that may cause a denial-of-service (DoS) condition.",
        "Status": "vulnerable",
        "Severity": "high",
        "Link": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-20863",
        "FixVersion": {
          "Type": "maven",
          "Version": "5.3.27"
        },
        "CVSSv3": {
          "ExploitabilityScore": 2.8,
          "ImpactScore": 3.6,
          "Score": 6.5,
          "Vectors": "CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:U/C:N/I:N/A:H",
          "Metrics": {
            "Exploitability": {
              "AttackVector": "Network",
              "AttackComplexity": "Low",
              "PrivilegesRequired": "Low",
              "UserInteraction": "None"
            },
            "Scope": "Unchanged",
            "Impact": {
              "Confidentiality": "None",
              "Integrity": "None",
              "Availability": "High"
            }
          }
        }
      },
      "Compare": {
        "Hash": "be1b53a07480d6cbf418170bc3154caea5c7be18"
      }
    }
  ],
  "LicenseViolations": [
    {
      "Id": "5cc8fb19-b292-49ca-9b6e-cac2249d08b9",
      "AffectedArtifactIds": [
        "15fde248-9fc1-4046-8fb4-bdfcff77ab44",
        "f33a544b-b0a2-47f1-bd28-e543ffb64bf9"
      ],
      "Info": {
        "Category": "restricted",
        "FoundLicense": "GPL-2.0-only"
      }
    },
    {
      "Id": "701b3b2d-6faa-484d-a309-d8dbf3d8b02f",
      "AffectedArtifactIds": [
        "15fde248-9fc1-4046-8fb4-bdfcff77ab44",
        "f33a544b-b0a2-47f1-bd28-e543ffb64bf9"
      ],
      "Info": {
        "Category": "restricted",
        "FoundLicense": "GPL-2.0-or-later"
      }
    },
    {
      "Id": "99302aa5-1adc-4dd8-9583-6e8a808c48a4",
      "AffectedArtifactIds": [
        "15fde248-9fc1-4046-8fb4-bdfcff77ab44",
        "f33a544b-b0a2-47f1-bd28-e543ffb64bf9"
      ],
      "Info": {
        "Category": "restricted",
        "FoundLicense": "GPL-2.0"
      }
    },
    {
      "Id": "4fd906bf-df9c-4c2b-a5b3-687066b9cd32",
      "AffectedArtifactIds": [
        "15fde248-9fc1-4046-8fb4-bdfcff77ab44",
        "f33a544b-b0a2-47f1-bd28-e543ffb64bf9"
      ],
      "Info": {
        "Category": "restricted",
        "FoundLicense": "GPL-2.0+"
      }
    },
    {
      "Id": "586af865-3108-4014-98f4-ea702ebb5ebc",
      "AffectedArtifactIds": [
        "15fde248-9fc1-4046-8fb4-bdfcff77ab44"
      ],
      "Info": {
        "Category": "restricted",
        "FoundLicense": "GPL-2.0-with-classpath-exception"
      }
    },
    {
      "Id": "e7b37a31-181e-4f62-ab3c-cc050c9d0dd6",
      "AffectedArtifactIds": [
        "f33a544b-b0a2-47f1-bd28-e543ffb64bf9"
      ],
      "Info": {
        "Category": "restricted",
        "FoundLicense": "LGPL-2.1"
      }
    },
    {
      "Id": "54e08b20-9e07-4379-89e6-2e64aabffc48",
      "AffectedArtifactIds": [
        "f33a544b-b0a2-47f1-bd28-e543ffb64bf9"
      ],
      "Info": {
        "Category": "restricted",
        "FoundLicense": "LGPL-2.1+"
      }
    }
  ],
  "FixSuggestions": [
    {
      "Id": "9a366d29-5229-480f-98f0-4edd69fa9cb6",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "3.2.3"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "3.2.3"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 2,
          "EdgeCnt": 1,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "1.0.2.RELEASE",
              "Edges": [
                {
                  "Version": "3.2.3",
                  "Severity": "critical",
                  "CVE": "CVE-2022-22963"
                }
              ]
            },
            {
              "Version": "3.2.3"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.springframework.cloud/spring-cloud-function-context@1.0.2.RELEASE\n  1.0.2.RELEASE is vulnerable:\n    critical   CVE-2022-22963       FixVersion= 3.2.3\n  3.2.3 is not vulnerable\n\nFix recommendations for package pkg:maven/org.springframework.cloud/spring-cloud-function-context@1.0.2.RELEASE\n  3.2.3 is the minimal version with no known vulnerabilities\n  3.2.3 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 2 versions (nodes) and 1 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "c0c8307b-06b4-4c37-b945-bf23ed885f69"
    },
    {
      "Id": "f090854e-7965-45a2-ae46-940f3c9fc8a9",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.7.18"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.7.18"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.7.1"
            },
            "Kind": "Minimal version with no critical or high vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 2,
          "EdgeCnt": 1,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "2.7.1",
              "Edges": [
                {
                  "Version": "2.7.18",
                  "Severity": "medium",
                  "CVE": "CVE-2023-34055"
                }
              ]
            },
            {
              "Version": "2.7.18"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.springframework.boot/spring-boot@2.7.1\n  2.7.1 is vulnerable:\n    medium     CVE-2023-34055       FixVersion= 2.7.18\n  2.7.18 is not vulnerable\n\nFix recommendations for package pkg:maven/org.springframework.boot/spring-boot@2.7.1\n  2.7.18 is the minimal version with no known vulnerabilities\n  2.7.18 is the maximum version and it has no known vulnerabilities\n  2.7.1 is the minimal version with no critical or high vulnerabilities\n\nStats: the Version Graph has 2 versions (nodes) and 1 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "5ceb92d4-b375-4de3-a86a-8f8b3e73f4b7"
    },
    {
      "Id": "2bf21d1f-496d-454b-a7a6-7caf7167625f",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "42.3.9"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "42.3.9"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 4,
          "EdgeCnt": 6,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "42.3.6",
              "Edges": [
                {
                  "Version": "42.3.9",
                  "Severity": "critical",
                  "CVE": "CVE-2024-1597"
                },
                {
                  "Version": "42.3.7",
                  "Severity": "high",
                  "CVE": "CVE-2022-31197"
                },
                {
                  "Version": "42.3.8",
                  "Severity": "medium",
                  "CVE": "CVE-2022-41946"
                }
              ]
            },
            {
              "Version": "42.3.7",
              "Edges": [
                {
                  "Version": "42.3.9",
                  "Severity": "critical",
                  "CVE": "CVE-2024-1597"
                },
                {
                  "Version": "42.3.8",
                  "Severity": "medium",
                  "CVE": "CVE-2022-41946"
                }
              ]
            },
            {
              "Version": "42.3.8",
              "Edges": [
                {
                  "Version": "42.3.9",
                  "Severity": "critical",
                  "CVE": "CVE-2024-1597"
                }
              ]
            },
            {
              "Version": "42.3.9"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.postgresql/postgresql@42.3.6\n  42.3.6 is vulnerable:\n    critical   CVE-2024-1597        FixVersion= 42.3.9\n    high       CVE-2022-31197       FixVersion= 42.3.7\n    medium     CVE-2022-41946       FixVersion= 42.3.8\n  42.3.7 is vulnerable:\n    critical   CVE-2024-1597        FixVersion= 42.3.9\n    medium     CVE-2022-41946       FixVersion= 42.3.8\n  42.3.8 is vulnerable:\n    critical   CVE-2024-1597        FixVersion= 42.3.9\n  42.3.9 is not vulnerable\n\nFix recommendations for package pkg:maven/org.postgresql/postgresql@42.3.6\n  42.3.9 is the minimal version with no known vulnerabilities\n  42.3.9 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 4 versions (nodes) and 6 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "9b96826a-5676-43ea-81b5-c44dc3473643"
    },
    {
      "Id": "961e686b-c2cf-440e-9ed5-6882c90fa193",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.7.12"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.7.12"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 2,
          "EdgeCnt": 1,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "2.7.1",
              "Edges": [
                {
                  "Version": "2.7.12",
                  "Severity": "high",
                  "CVE": "CVE-2023-20883"
                }
              ]
            },
            {
              "Version": "2.7.12"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.springframework.boot/spring-boot-autoconfigure@2.7.1\n  2.7.1 is vulnerable:\n    high       CVE-2023-20883       FixVersion= 2.7.12\n  2.7.12 is not vulnerable\n\nFix recommendations for package pkg:maven/org.springframework.boot/spring-boot-autoconfigure@2.7.1\n  2.7.12 is the minimal version with no known vulnerabilities\n  2.7.12 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 2 versions (nodes) and 1 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "900b929e-d6da-4913-aaf1-494a5eacc490"
    },
    {
      "Id": "8af3a4f9-8417-4878-892d-643dd02f7cbd",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "6.0.17"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "6.0.17"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 4,
          "EdgeCnt": 4,
          "ExtraAthenaCalls": 2,
          "VersionGraph": [
            {
              "Version": "5.3.21",
              "Edges": [
                {
                  "Version": "6.0.0",
                  "Severity": "critical",
                  "CVE": "CVE-2016-1000027"
                },
                {
                  "Version": "5.3.32",
                  "Severity": "high",
                  "CVE": "CVE-2024-22243"
                }
              ]
            },
            {
              "Version": "5.3.32",
              "Edges": [
                {
                  "Version": "6.0.0",
                  "Severity": "critical",
                  "CVE": "CVE-2016-1000027"
                }
              ]
            },
            {
              "Version": "6.0.0",
              "Edges": [
                {
                  "Version": "6.0.17",
                  "Severity": "high",
                  "CVE": "CVE-2024-22243"
                }
              ]
            },
            {
              "Version": "6.0.17"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.springframework/spring-web@5.3.21\n  5.3.21 is vulnerable:\n    critical   CVE-2016-1000027     FixVersion= 6.0.0\n    high       CVE-2024-22243       FixVersion= 5.3.32\n  5.3.32 is vulnerable:\n    critical   CVE-2016-1000027     FixVersion= 6.0.0\n  6.0.0 is vulnerable:\n    high       CVE-2024-22243       FixVersion= 6.0.17\n  6.0.17 is not vulnerable\n\nFix recommendations for package pkg:maven/org.springframework/spring-web@5.3.21\n  6.0.17 is the minimal version with no known vulnerabilities\n  6.0.17 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 4 versions (nodes) and 4 CVEs (edges) (diameter=2)\n\n"
      },
      "AffectedArtifactId": "384a7a6e-8e8b-49aa-866e-01ea758285e8"
    },
    {
      "Id": "45346cd0-53b2-4ee5-8a43-6b149c0fee46",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "1.2.13"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "1.2.13"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 2,
          "EdgeCnt": 1,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "1.2.11",
              "Edges": [
                {
                  "Version": "1.2.13",
                  "Severity": "high",
                  "CVE": "CVE-2023-6378"
                }
              ]
            },
            {
              "Version": "1.2.13"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/ch.qos.logback/logback-classic@1.2.11\n  1.2.11 is vulnerable:\n    high       CVE-2023-6378        FixVersion= 1.2.13\n  1.2.13 is not vulnerable\n\nFix recommendations for package pkg:maven/ch.qos.logback/logback-classic@1.2.11\n  1.2.13 is the minimal version with no known vulnerabilities\n  1.2.13 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 2 versions (nodes) and 1 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "143cae9d-a474-4f5a-aba3-1d6f170bfa82"
    },
    {
      "Id": "4d9f3995-ce8a-4a7a-a483-c97758cd5b2c",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.0"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.0"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 4,
          "EdgeCnt": 11,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "1.30",
              "Edges": [
                {
                  "Version": "1.31",
                  "Severity": "high",
                  "CVE": "CVE-2022-25857"
                },
                {
                  "Version": "2.0",
                  "Severity": "high",
                  "CVE": "CVE-2022-1471"
                },
                {
                  "Version": "1.31",
                  "Severity": "medium",
                  "CVE": "CVE-2022-38751"
                },
                {
                  "Version": "1.31",
                  "Severity": "medium",
                  "CVE": "CVE-2022-38749"
                },
                {
                  "Version": "1.31",
                  "Severity": "medium",
                  "CVE": "CVE-2022-38750"
                },
                {
                  "Version": "1.32",
                  "Severity": "medium",
                  "CVE": "CVE-2022-38752"
                },
                {
                  "Version": "1.32",
                  "Severity": "medium",
                  "CVE": "CVE-2022-41854"
                }
              ]
            },
            {
              "Version": "1.31",
              "Edges": [
                {
                  "Version": "2.0",
                  "Severity": "high",
                  "CVE": "CVE-2022-1471"
                },
                {
                  "Version": "1.32",
                  "Severity": "medium",
                  "CVE": "CVE-2022-38752"
                },
                {
                  "Version": "1.32",
                  "Severity": "medium",
                  "CVE": "CVE-2022-41854"
                }
              ]
            },
            {
              "Version": "1.32",
              "Edges": [
                {
                  "Version": "2.0",
                  "Severity": "high",
                  "CVE": "CVE-2022-1471"
                }
              ]
            },
            {
              "Version": "2.0"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.yaml/snakeyaml@1.30\n  1.30 is vulnerable:\n    high       CVE-2022-25857       FixVersion= 1.31\n    high       CVE-2022-1471        FixVersion= 2.0\n    medium     CVE-2022-38751       FixVersion= 1.31\n    medium     CVE-2022-38749       FixVersion= 1.31\n    medium     CVE-2022-38750       FixVersion= 1.31\n    medium     CVE-2022-38752       FixVersion= 1.32\n    medium     CVE-2022-41854       FixVersion= 1.32\n  1.31 is vulnerable:\n    high       CVE-2022-1471        FixVersion= 2.0\n    medium     CVE-2022-38752       FixVersion= 1.32\n    medium     CVE-2022-41854       FixVersion= 1.32\n  1.32 is vulnerable:\n    high       CVE-2022-1471        FixVersion= 2.0\n  2.0 is not vulnerable\n\nFix recommendations for package pkg:maven/org.yaml/snakeyaml@1.30\n  2.0 is the minimal version with no known vulnerabilities\n  2.0 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 4 versions (nodes) and 11 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "5ca8c53c-ee09-4020-94e9-594658dcfa4d"
    },
    {
      "Id": "e98c2c53-2bff-43e0-85ec-9c84ddf417ae",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.7.11"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.7.11"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 2,
          "EdgeCnt": 1,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "2.7.1",
              "Edges": [
                {
                  "Version": "2.7.11",
                  "Severity": "critical",
                  "CVE": "CVE-2023-20873"
                }
              ]
            },
            {
              "Version": "2.7.11"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.springframework.boot/spring-boot-actuator-autoconfigure@2.7.1\n  2.7.1 is vulnerable:\n    critical   CVE-2023-20873       FixVersion= 2.7.11\n  2.7.11 is not vulnerable\n\nFix recommendations for package pkg:maven/org.springframework.boot/spring-boot-actuator-autoconfigure@2.7.1\n  2.7.11 is the minimal version with no known vulnerabilities\n  2.7.11 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 2 versions (nodes) and 1 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "f738111f-5337-4ebb-a6d5-edde360ed125"
    },
    {
      "Id": "43814321-c6f0-4cc2-88b7-ff4c45489157",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "5.3.27"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "5.3.27"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 3,
          "EdgeCnt": 3,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "5.3.21",
              "Edges": [
                {
                  "Version": "5.3.27",
                  "Severity": "high",
                  "CVE": "CVE-2023-20863"
                },
                {
                  "Version": "5.3.26",
                  "Severity": "medium",
                  "CVE": "CVE-2023-20861"
                }
              ]
            },
            {
              "Version": "5.3.26",
              "Edges": [
                {
                  "Version": "5.3.27",
                  "Severity": "high",
                  "CVE": "CVE-2023-20863"
                }
              ]
            },
            {
              "Version": "5.3.27"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.springframework/spring-expression@5.3.21\n  5.3.21 is vulnerable:\n    high       CVE-2023-20863       FixVersion= 5.3.27\n    medium     CVE-2023-20861       FixVersion= 5.3.26\n  5.3.26 is vulnerable:\n    high       CVE-2023-20863       FixVersion= 5.3.27\n  5.3.27 is not vulnerable\n\nFix recommendations for package pkg:maven/org.springframework/spring-expression@5.3.21\n  5.3.27 is the minimal version with no known vulnerabilities\n  5.3.27 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 3 versions (nodes) and 3 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "b076eb9e-ae9c-4597-906a-8e6e8d901d10"
    },
    {
      "Id": "0181b9f1-a691-49d7-9b73-f4086cd148d6",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "1.2.13"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "1.2.13"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 2,
          "EdgeCnt": 1,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "1.2.11",
              "Edges": [
                {
                  "Version": "1.2.13",
                  "Severity": "high",
                  "CVE": "CVE-2023-6378"
                }
              ]
            },
            {
              "Version": "1.2.13"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/ch.qos.logback/logback-core@1.2.11\n  1.2.11 is vulnerable:\n    high       CVE-2023-6378        FixVersion= 1.2.13\n  1.2.13 is not vulnerable\n\nFix recommendations for package pkg:maven/ch.qos.logback/logback-core@1.2.11\n  1.2.13 is the minimal version with no known vulnerabilities\n  1.2.13 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 2 versions (nodes) and 1 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "8a7c2688-0814-49eb-8e2d-475548ff8154"
    },
    {
      "Id": "624b57e0-db18-4fe5-b996-37a48b7e3198",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "3.2.3"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "3.2.3"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 2,
          "EdgeCnt": 1,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "1.0.2.RELEASE",
              "Edges": [
                {
                  "Version": "3.2.3",
                  "Severity": "critical",
                  "CVE": "CVE-2022-22963"
                }
              ]
            },
            {
              "Version": "3.2.3"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.springframework.cloud/spring-cloud-function-core@1.0.2.RELEASE\n  1.0.2.RELEASE is vulnerable:\n    critical   CVE-2022-22963       FixVersion= 3.2.3\n  3.2.3 is not vulnerable\n\nFix recommendations for package pkg:maven/org.springframework.cloud/spring-cloud-function-core@1.0.2.RELEASE\n  3.2.3 is the minimal version with no known vulnerabilities\n  3.2.3 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 2 versions (nodes) and 1 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "09c2e4e0-ba53-4404-bc6c-4d062890555f"
    },
    {
      "Id": "ded43856-8284-4586-a2a8-814ee02018fc",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "9.0.86"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "9.0.86"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "9.0.83"
            },
            "Kind": "Minimal version with no critical or high vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 5,
          "EdgeCnt": 14,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "9.0.64",
              "Edges": [
                {
                  "Version": "9.0.83",
                  "Severity": "high",
                  "CVE": "CVE-2023-46589"
                },
                {
                  "Version": "9.0.80",
                  "Severity": "medium",
                  "CVE": "CVE-2023-41080"
                },
                {
                  "Version": "9.0.81",
                  "Severity": "medium",
                  "CVE": "CVE-2023-44487"
                },
                {
                  "Version": "9.0.81",
                  "Severity": "medium",
                  "CVE": "CVE-2023-45648"
                },
                {
                  "Version": "9.0.81",
                  "Severity": "medium",
                  "CVE": "CVE-2023-42795"
                },
                {
                  "Version": "9.0.86",
                  "Severity": "medium",
                  "CVE": "CVE-2024-24549"
                }
              ]
            },
            {
              "Version": "9.0.80",
              "Edges": [
                {
                  "Version": "9.0.83",
                  "Severity": "high",
                  "CVE": "CVE-2023-46589"
                },
                {
                  "Version": "9.0.81",
                  "Severity": "medium",
                  "CVE": "CVE-2023-44487"
                },
                {
                  "Version": "9.0.81",
                  "Severity": "medium",
                  "CVE": "CVE-2023-45648"
                },
                {
                  "Version": "9.0.81",
                  "Severity": "medium",
                  "CVE": "CVE-2023-42795"
                },
                {
                  "Version": "9.0.86",
                  "Severity": "medium",
                  "CVE": "CVE-2024-24549"
                }
              ]
            },
            {
              "Version": "9.0.81",
              "Edges": [
                {
                  "Version": "9.0.83",
                  "Severity": "high",
                  "CVE": "CVE-2023-46589"
                },
                {
                  "Version": "9.0.86",
                  "Severity": "medium",
                  "CVE": "CVE-2024-24549"
                }
              ]
            },
            {
              "Version": "9.0.83",
              "Edges": [
                {
                  "Version": "9.0.86",
                  "Severity": "medium",
                  "CVE": "CVE-2024-24549"
                }
              ]
            },
            {
              "Version": "9.0.86"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.apache.tomcat.embed/tomcat-embed-core@9.0.64\n  9.0.64 is vulnerable:\n    high       CVE-2023-46589       FixVersion= 9.0.83\n    medium     CVE-2023-41080       FixVersion= 9.0.80\n    medium     CVE-2023-44487       FixVersion= 9.0.81\n    medium     CVE-2023-45648       FixVersion= 9.0.81\n    medium     CVE-2023-42795       FixVersion= 9.0.81\n    medium     CVE-2024-24549       FixVersion= 9.0.86\n  9.0.80 is vulnerable:\n    high       CVE-2023-46589       FixVersion= 9.0.83\n    medium     CVE-2023-44487       FixVersion= 9.0.81\n    medium     CVE-2023-45648       FixVersion= 9.0.81\n    medium     CVE-2023-42795       FixVersion= 9.0.81\n    medium     CVE-2024-24549       FixVersion= 9.0.86\n  9.0.81 is vulnerable:\n    high       CVE-2023-46589       FixVersion= 9.0.83\n    medium     CVE-2024-24549       FixVersion= 9.0.86\n  9.0.83 is vulnerable:\n    medium     CVE-2024-24549       FixVersion= 9.0.86\n  9.0.86 is not vulnerable\n\nFix recommendations for package pkg:maven/org.apache.tomcat.embed/tomcat-embed-core@9.0.64\n  9.0.86 is the minimal version with no known vulnerabilities\n  9.0.86 is the maximum version and it has no known vulnerabilities\n  9.0.83 is the minimal version with no critical or high vulnerabilities\n\nStats: the Version Graph has 5 versions (nodes) and 14 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "dd8ba96c-d491-462c-851c-74f6910986bd"
    },
    {
      "Id": "67d55d07-fc1e-4ac3-877d-f305dcbe68ec",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.13.4.2"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.13.4.2"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 3,
          "EdgeCnt": 3,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "2.13.3",
              "Edges": [
                {
                  "Version": "2.13.4",
                  "Severity": "high",
                  "CVE": "CVE-2022-42004"
                },
                {
                  "Version": "2.13.4.2",
                  "Severity": "high",
                  "CVE": "CVE-2022-42003"
                }
              ]
            },
            {
              "Version": "2.13.4",
              "Edges": [
                {
                  "Version": "2.13.4.2",
                  "Severity": "high",
                  "CVE": "CVE-2022-42003"
                }
              ]
            },
            {
              "Version": "2.13.4.2"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.13.3\n  2.13.3 is vulnerable:\n    high       CVE-2022-42004       FixVersion= 2.13.4\n    high       CVE-2022-42003       FixVersion= 2.13.4.2\n  2.13.4 is vulnerable:\n    high       CVE-2022-42003       FixVersion= 2.13.4.2\n  2.13.4.2 is not vulnerable\n\nFix recommendations for package pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.13.3\n  2.13.4.2 is the minimal version with no known vulnerabilities\n  2.13.4.2 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 3 versions (nodes) and 3 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "11c20fe7-0461-4940-b213-fb9fe3e63ddf"
    },
    {
      "Id": "210d7e6f-4afe-434e-b0df-796c30de2768",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.17.1"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.17.1"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.17.0"
            },
            "Kind": "Minimal version with no critical or high vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 4,
          "EdgeCnt": 6,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "2.15.0",
              "Edges": [
                {
                  "Version": "2.16.0",
                  "Severity": "critical",
                  "CVE": "CVE-2021-45046"
                },
                {
                  "Version": "2.17.0",
                  "Severity": "high",
                  "CVE": "CVE-2021-45105"
                },
                {
                  "Version": "2.17.1",
                  "Severity": "medium",
                  "CVE": "CVE-2021-44832"
                }
              ]
            },
            {
              "Version": "2.16.0",
              "Edges": [
                {
                  "Version": "2.17.0",
                  "Severity": "high",
                  "CVE": "CVE-2021-45105"
                },
                {
                  "Version": "2.17.1",
                  "Severity": "medium",
                  "CVE": "CVE-2021-44832"
                }
              ]
            },
            {
              "Version": "2.17.0",
              "Edges": [
                {
                  "Version": "2.17.1",
                  "Severity": "medium",
                  "CVE": "CVE-2021-44832"
                }
              ]
            },
            {
              "Version": "2.17.1"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/org.apache.logging.log4j/log4j-core@2.15.0\n  2.15.0 is vulnerable:\n    critical   CVE-2021-45046       FixVersion= 2.16.0\n    high       CVE-2021-45105       FixVersion= 2.17.0\n    medium     CVE-2021-44832       FixVersion= 2.17.1\n  2.16.0 is vulnerable:\n    high       CVE-2021-45105       FixVersion= 2.17.0\n    medium     CVE-2021-44832       FixVersion= 2.17.1\n  2.17.0 is vulnerable:\n    medium     CVE-2021-44832       FixVersion= 2.17.1\n  2.17.1 is not vulnerable\n\nFix recommendations for package pkg:maven/org.apache.logging.log4j/log4j-core@2.15.0\n  2.17.1 is the minimal version with no known vulnerabilities\n  2.17.1 is the maximum version and it has no known vulnerabilities\n  2.17.0 is the minimal version with no critical or high vulnerabilities\n\nStats: the Version Graph has 4 versions (nodes) and 6 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "285a3fbc-4152-42b6-8b12-c2320096fabd"
    },
    {
      "Id": "28d61623-b000-46d2-9ea0-042cec1c9b28",
      "Info": {
        "Recommendations": [
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.2.220"
            },
            "Kind": "Minimal version with no known vulnerabilities"
          },
          {
            "FixVersion": {
              "Type": "maven",
              "Version": "2.2.220"
            },
            "Kind": "Maximum version with no known vulnerabilities"
          }
        ],
        "VersionGraphInfo": {
          "NodeCnt": 2,
          "EdgeCnt": 1,
          "ExtraAthenaCalls": 1,
          "VersionGraph": [
            {
              "Version": "2.1.214",
              "Edges": [
                {
                  "Version": "2.2.220",
                  "Severity": "high",
                  "CVE": "CVE-2022-45868"
                }
              ]
            },
            {
              "Version": "2.2.220"
            }
          ]
        },
        "FixSuggestionInfoAsString": "\nSorted Version Graph for package pkg:maven/com.h2database/h2@2.1.214\n  2.1.214 is vulnerable:\n    high       CVE-2022-45868       FixVersion= 2.2.220\n  2.2.220 is not vulnerable\n\nFix recommendations for package pkg:maven/com.h2database/h2@2.1.214\n  2.2.220 is the minimal version with no known vulnerabilities\n  2.2.220 is the maximum version and it has no known vulnerabilities\n\nStats: the Version Graph has 2 versions (nodes) and 1 CVEs (edges) (diameter=1)\n\n"
      },
      "AffectedArtifactId": "fc3e2bbe-f17e-44a8-a727-16c745163862"
    }
  ]
}