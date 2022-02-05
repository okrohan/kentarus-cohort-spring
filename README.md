# kentarus-cohort-spring
Test App build for Cloud cohort


# Deployment
Use the `deploy.sh` script to build and deploy Spring App to an EC2 install
```
./deploy.sh RELATIVE_SSH_KEY_PATH EC2_INSTANCE_URI
```

Example
```
./deploy.sh ./ec2-demo.pem ec2-user@ec2-3-95-165-206.compute-1.amazonaws.com
```

PS: 
- Script is currently written for SpringBoot apps built with Maven
- Gradle user can tweak `./deploy.sh` and `./scripts/ec2-run-jar.sh` at said points in the script comments.

Reference:
https://kgaurav23.medium.com/deploying-hosting-spring-boot-applications-on-aws-ec2-7babc15a1ab6
