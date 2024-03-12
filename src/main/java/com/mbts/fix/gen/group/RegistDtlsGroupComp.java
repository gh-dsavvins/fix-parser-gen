package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class RegistDtlsGroupComp extends AbstractGroupComponent {

  private final RegistDtls registDtls;
  private final RegistEmail registEmail;
  private final MailingDtls mailingDtls;
  private final MailingInst mailingInst;
  private final NestedPartyIDsGroup nestedPartyIDsGroup;
  private final OwnerType ownerType;
  private final DateOfBirth dateOfBirth;
  private final InvestorCountryOfResidence investorCountryOfResidence;

  public RegistDtlsGroupComp(AbstractMessage message) {
    super(message);
    registDtls = new RegistDtls(message);
    registEmail = new RegistEmail(message);
    mailingDtls = new MailingDtls(message);
    mailingInst = new MailingInst(message);
    nestedPartyIDsGroup = new NestedPartyIDsGroup(message);
    ownerType = new OwnerType(message);
    dateOfBirth = new DateOfBirth(message);
    investorCountryOfResidence = new InvestorCountryOfResidence(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 509 -> registDtls.map(version, bytes, fldBeg);
      case 511 -> registEmail.map(version, bytes, fldBeg);
      case 474 -> mailingDtls.map(version, bytes, fldBeg);
      case 482 -> mailingInst.map(version, bytes, fldBeg);
      case 545,804,805,538,539,524,525 -> 
          nestedPartyIDsGroup.map(tag, fldBeg);
      case 522 -> ownerType.map(version, bytes, fldBeg);
      case 486 -> dateOfBirth.map(version, bytes, fldBeg);
      case 475 -> investorCountryOfResidence.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 509 -> registDtls;
      case 511 -> registEmail;
      case 474 -> mailingDtls;
      case 482 -> mailingInst;
      case 545,804,805,538,539,524,525 -> 
          nestedPartyIDsGroup.field(tag);
      case 522 -> ownerType;
      case 486 -> dateOfBirth;
      case 475 -> investorCountryOfResidence;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = registDtls.write(valBeg);
    valBeg = registEmail.write(valBeg);
    valBeg = mailingDtls.write(valBeg);
    valBeg = mailingInst.write(valBeg);
    valBeg = nestedPartyIDsGroup.write(valBeg);
    valBeg = ownerType.write(valBeg);
    valBeg = dateOfBirth.write(valBeg);
    valBeg = investorCountryOfResidence.write(valBeg);
    return valBeg; 
  }
}