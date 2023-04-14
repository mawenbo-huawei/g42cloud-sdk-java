# 0.0.5-beta 2023-04-14

### G42Cloud SDK Core

- _Features_
  - None
- _Bug Fix_
  - None
- _Change_
  - Optimize the code structure.

### G42Cloud SDK BMS

- _Features_
  - None
- _Bug Fix_
  - None
- _Change_
  - **ShowJobInfos**
    - changes of response param
      - `* begin_time: date-time -> string`
      - `* end_time: date-time -> string`
      - `* entities.sub_jobs.begin_time: date-time -> string`
      - `* entities.sub_jobs.end_time: date-time -> string`
  - **ListBareMetalServers**
    - changes of response param
      - `+ servers.status: enum value [HARD_REBOOT,DELETED]`
      - `- servers.OS-EXT-STS:vm_state: enum value [suspended]`
  - **ListBareMetalServerDetails**
    - changes of response param
      - `+ server.status: enum value [HARD_REBOOT,DELETED]`
      - `- server.OS-EXT-STS:vm_state: enum value [suspended]`
  - **ChangeBaremetalServerName**
    - changes of response param
      - `- server.OS-EXT-STS:vm_state: enum value [SUSPENDED]`

# 0.0.4-beta 2023-02-20

### G42Cloud SDK CBR

- _Features_
  - None
- _Bug Fix_
  - None
- _Change_
  - The request parameter `policy_id` changed to required of the interface `AssociateVaultPolicy`

### G42Cloud SDK IMS

- _Features_
  - None
- _Bug Fix_
  - None
- _Change_
  - Add the enum values `IsoImage` to the request parameter `type` to the interface `CreateImage`

# 0.0.3-beta 2023-01-06

### G42Cloud SDK AS

- _Features_
  - New Support AS
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK BMS

- _Features_
  - New Support BMS
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK IMS

- _Features_
  - New Support IMS
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK SMN

- _Features_
  - New Support SMN
- _Bug Fix_
  - None
- _Change_
  - None

# 0.0.2-beta 2022-11-29

### G42Cloud SDK CBR

- _Features_
  - New Support CBR
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK CES

- _Features_
  - New Support CES
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK CSE

- _Features_
  - New Support CSE
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK CTS

- _Features_
  - New Support CTS
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK ELB

- _Features_
  - New Support ELB
- _Bug Fix_
  - None
- _Change_
  - None

# 0.0.1-beta 2022-11-23

### G42Cloud SDK CCE

- _Features_
    - New Support CCE
- _Bug Fix_
    - None
- _Change_
    - None

### G42Cloud SDK CDN

- _Features_
    - New Support CDN
- _Bug Fix_
    - None
- _Change_
    - None

### G42Cloud SDK ECS

- _Features_
  - New Support ECS
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK EVS

- _Features_
  - New Support EVS
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK RDS

- _Features_
  - New Support RDS
- _Bug Fix_
  - None
- _Change_
  - None

### G42Cloud SDK VPC

- _Features_
  - New Support VPC
- _Bug Fix_
  - None
- _Change_
  - None

