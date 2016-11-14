
package views.html.profile

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.ProfileRegister],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
"""),format.raw/*4.1*/("""<section id="about">

	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS','Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>Business Profile</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Business
				Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="name" required="required"
					placeholder="Business Name..." /><span class="icon-place"></span>
			</div>
		</div>
		
		<div class="element-address"><label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required"/><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address2" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required"/><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required"/><span class="icon-place"></span></span><div class="country"><select name="country" required="required"><option selected="selected" value="" disabled="disabled">--- Select a country ---</option><option value="United States">United States</option><option value="United Kingdom">United Kingdom</option><option value="Australia">Australia</option><option value="Canada">Canada</option><option value="France">France</option><option value="New Zealand">New Zealand</option><option value="India">India</option><option value="Brazil">Brazil</option><option value="----" disabled="disabled">----</option><option value="Afghanistan">Afghanistan</option><option value="Aland Islands">Aland Islands</option><option value="Albania">Albania</option><option value="Algeria">Algeria</option><option value="American Samoa">American Samoa</option><option value="Andorra">Andorra</option><option value="Angola">Angola</option><option value="Anguilla">Anguilla</option><option value="Antarctica">Antarctica</option><option value="Antigua and Barbuda">Antigua and Barbuda</option><option value="Argentina">Argentina</option><option value="Armenia">Armenia</option><option value="Aruba">Aruba</option><option value="Austria">Austria</option><option value="Azerbaijan">Azerbaijan</option><option value="Bahamas">Bahamas</option><option value="Bahrain">Bahrain</option><option value="Bangladesh">Bangladesh</option><option value="Barbados">Barbados</option><option value="Belarus">Belarus</option><option value="Belgium">Belgium</option><option value="Belize">Belize</option><option value="Benin">Benin</option><option value="Bermuda">Bermuda</option><option value="Bhutan">Bhutan</option><option value="Bolivia">Bolivia</option><option value="Bosnia and Herzegovina">Bosnia and Herzegovina</option><option value="Botswana">Botswana</option><option value="British Indian Ocean Territory">British Indian Ocean Territory</option><option value="Brunei Darussalam">Brunei Darussalam</option><option value="Bulgaria">Bulgaria</option><option value="Burkina Faso">Burkina Faso</option><option value="Burundi">Burundi</option><option value="Cambodia">Cambodia</option><option value="Cameroon">Cameroon</option><option value="Cape Verde">Cape Verde</option><option value="Cayman Islands">Cayman Islands</option><option value="Central African Republic">Central African Republic</option><option value="Chad">Chad</option><option value="Chile">Chile</option><option value="China">China</option><option value="Colombia">Colombia</option><option value="Comoros">Comoros</option><option value="Democratic Republic of the Congo">Democratic Republic of the Congo</option><option value="Republic of the Congo">Republic of the Congo</option><option value="Cook Islands">Cook Islands</option><option value="Costa Rica">Costa Rica</option><option value="Cote d'Ivoire">Cote d'Ivoire</option><option value="Croatia">Croatia</option><option value="Cuba">Cuba</option><option value="Cyprus">Cyprus</option><option value="Czech Republic">Czech Republic</option><option value="Denmark">Denmark</option><option value="Djibouti">Djibouti</option><option value="Dominica">Dominica</option><option value="Dominican Republic">Dominican Republic</option><option value="East Timor">East Timor</option><option value="Ecuador">Ecuador</option><option value="Egypt">Egypt</option><option value="El Salvador">El Salvador</option><option value="Equatorial Guinea">Equatorial Guinea</option><option value="Eritrea">Eritrea</option><option value="Estonia">Estonia</option><option value="Ethiopia">Ethiopia</option><option value="Faroe Islands">Faroe Islands</option><option value="Fiji">Fiji</option><option value="Finland">Finland</option><option value="Gabon">Gabon</option><option value="Gambia">Gambia</option><option value="Georgia">Georgia</option><option value="Germany">Germany</option><option value="Ghana">Ghana</option><option value="Gibraltar">Gibraltar</option><option value="Greece">Greece</option><option value="Grenada">Grenada</option><option value="Guatemala">Guatemala</option><option value="Guinea">Guinea</option><option value="Guinea-Bissau">Guinea-Bissau</option><option value="Guyana">Guyana</option><option value="Haiti">Haiti</option><option value="Honduras">Honduras</option><option value="Hong Kong">Hong Kong</option><option value="Hungary">Hungary</option><option value="Iceland">Iceland</option><option value="Indonesia">Indonesia</option><option value="Iran">Iran</option><option value="Iraq">Iraq</option><option value="Ireland">Ireland</option><option value="Israel">Israel</option><option value="Italy">Italy</option><option value="Jamaica">Jamaica</option><option value="Japan">Japan</option><option value="Jordan">Jordan</option><option value="Kazakhstan">Kazakhstan</option><option value="Kenya">Kenya</option><option value="Kiribati">Kiribati</option><option value="North Korea">North Korea</option><option value="South Korea">South Korea</option><option value="Kuwait">Kuwait</option><option value="Kyrgyzstan">Kyrgyzstan</option><option value="Laos">Laos</option><option value="Latvia">Latvia</option><option value="Lebanon">Lebanon</option><option value="Lesotho">Lesotho</option><option value="Liberia">Liberia</option><option value="Libya">Libya</option><option value="Liechtenstein">Liechtenstein</option><option value="Lithuania">Lithuania</option><option value="Luxembourg">Luxembourg</option><option value="Macedonia">Macedonia</option><option value="Madagascar">Madagascar</option><option value="Malawi">Malawi</option><option value="Malaysia">Malaysia</option><option value="Maldives">Maldives</option><option value="Mali">Mali</option><option value="Malta">Malta</option><option value="Marshall Islands">Marshall Islands</option><option value="Mauritania">Mauritania</option><option value="Mauritius">Mauritius</option><option value="Mexico">Mexico</option><option value="Micronesia">Micronesia</option><option value="Moldova">Moldova</option><option value="Monaco">Monaco</option><option value="Mongolia">Mongolia</option><option value="Montenegro">Montenegro</option><option value="Morocco">Morocco</option><option value="Mozambique">Mozambique</option><option value="Myanmar">Myanmar</option><option value="Namibia">Namibia</option><option value="Nauru">Nauru</option><option value="Nepal">Nepal</option><option value="Netherlands">Netherlands</option><option value="Netherlands Antilles">Netherlands Antilles</option><option value="Nicaragua">Nicaragua</option><option value="Niger">Niger</option><option value="Nigeria">Nigeria</option><option value="Norway">Norway</option><option value="Oman">Oman</option><option value="Pakistan">Pakistan</option><option value="Palau">Palau</option><option value="Palestine">Palestine</option><option value="Panama">Panama</option><option value="Papua New Guinea">Papua New Guinea</option><option value="Paraguay">Paraguay</option><option value="Peru">Peru</option><option value="Philippines">Philippines</option><option value="Poland">Poland</option><option value="Portugal">Portugal</option><option value="Puerto Rico">Puerto Rico</option><option value="Qatar">Qatar</option><option value="Romania">Romania</option><option value="Russia">Russia</option><option value="Rwanda">Rwanda</option><option value="Saint Kitts and Nevis">Saint Kitts and Nevis</option><option value="Saint Lucia">Saint Lucia</option><option value="Saint Vincent and the Grenadines">Saint Vincent and the Grenadines</option><option value="Samoa">Samoa</option><option value="San Marino">San Marino</option><option value="Sao Tome and Principe">Sao Tome and Principe</option><option value="Saudi Arabia">Saudi Arabia</option><option value="Senegal">Senegal</option><option value="Serbia">Serbia</option><option value="Seychelles">Seychelles</option><option value="Sierra Leone">Sierra Leone</option><option value="Singapore">Singapore</option><option value="Slovakia">Slovakia</option><option value="Slovenia">Slovenia</option><option value="Solomon Islands">Solomon Islands</option><option value="Somalia">Somalia</option><option value="South Africa">South Africa</option><option value="Spain">Spain</option><option value="Sri Lanka">Sri Lanka</option><option value="Sudan">Sudan</option><option value="Suriname">Suriname</option><option value="Swaziland">Swaziland</option><option value="Sweden">Sweden</option><option value="Switzerland">Switzerland</option><option value="Syria">Syria</option><option value="Taiwan">Taiwan</option><option value="Tajikistan">Tajikistan</option><option value="Tanzania">Tanzania</option><option value="Thailand">Thailand</option><option value="Togo">Togo</option><option value="Tonga">Tonga</option><option value="Trinidad and Tobago">Trinidad and Tobago</option><option value="Tunisia">Tunisia</option><option value="Turkey">Turkey</option><option value="Turkmenistan">Turkmenistan</option><option value="Tuvalu">Tuvalu</option><option value="Uganda">Uganda</option><option value="Ukraine">Ukraine</option><option value="United Arab Emirates">United Arab Emirates</option><option value="United States Minor Outlying Islands">United States Minor Outlying Islands</option><option value="Uruguay">Uruguay</option><option value="Uzbekistan">Uzbekistan</option><option value="Vanuatu">Vanuatu</option><option value="Vatican City">Vatican City</option><option value="Venezuela">Venezuela</option><option value="Vietnam">Vietnam</option><option value="Virgin Islands, British">Virgin Islands, British</option><option value="Virgin Islands, U.S.">Virgin Islands, U.S.</option><option value="Yemen">Yemen</option><option value="Zambia">Zambia</option><option value="Zimbabwe">Zimbabwe</option></select><i></i><span class="icon-place"></span></div></div>
	
		
		<div class="element-name">
			<label class="title"><span class="required">*</span>Primary Contact
				Name:</label><span class="nameFirst"><input
				placeholder="First Name..." type="text" size="8" name="primaryNameFirst"
				required="required" /><span class="icon-place"></span></span><span
				class="nameLast"><input placeholder="Last Name..."
				type="text" size="14" name="primaryNameLast" required="required" /><span
				class="icon-place"></span></span>
		</div>
		<div class="element-phone">
			<label class="title"><span class="required">*</span>Primary Contact
				Phone Number:</label>
			<div class="item-cont">
				<input class="large" type="tel"
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*38.38*/("""{"""),format.raw/*38.39*/("""3,"""),format.raw/*38.41*/("""}"""),format.raw/*38.42*/("""" maxlength="24" name="primaryPhone"
					required="required" placeholder="Phone Number..." value="" /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-email">
			<label class="title"><span class="required">*</span>Primary Contact
				Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="primaryEmail" value=""
					required="required" placeholder="Email..." /><span
					class="icon-place"></span>
			</div>
		</div>
				<div class="element-name">
			<label class="title"><span class="required">*</span>Secondary Contact
				Name:</label><span class="nameFirst"><input
				placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
				required="required" /><span class="icon-place"></span></span><span
				class="nameLast"><input placeholder="Last Name..."
				type="text" size="14" name="secondaryNameLast" required="required" /><span
				class="icon-place"></span></span>
		</div>
		<div class="element-phone">
			<label class="title"><span class="required">*</span>Secondary Contact
				Phone Number:</label>
			<div class="item-cont">
				<input class="large" type="tel"
					pattern="[+]?[\.\s\-\(\)\*\#0-9]"""),format.raw/*66.38*/("""{"""),format.raw/*66.39*/("""3,"""),format.raw/*66.41*/("""}"""),format.raw/*66.42*/("""" maxlength="24" name="secondaryPhone"
					required="required" placeholder="Phone Number..." value="" /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-email">
			<label class="title"><span class="required">*</span>Secondary Contact
				Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="secondaryEmail" value=""
					required="required" placeholder="Email..." /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-checkbox">
			<label class="title">Services Provided:<span class="required">*</span></label>
			<div class="column column1">
				<label><input type="checkbox"
					onclick="profileServicesOtherShowHide(this);" name="services"
					value="waterbottled" ><span>Water
				Bottled</span></label> <label><input type="checkbox" name="services"
					value="waterbulk" ><span>Water
				Bulk</span></label> <label><input type="checkbox" name="services"
					value="sanitation" ><span>Sanitation/Toilet/Sink</span></label>
				<label><input type="checkbox" name="services"
					value="dumpster"><span>Dumpsters</span></label>
				<label><input type="checkbox" name="services"
					value="shower" ><span>Showers</span></label> <label><input
					type="checkbox" name="services" value="generator" ><span>Generators</span></label> <label><input
					type="checkbox" name="services" value="pump"
					><span>Pumps</span></label> <label><input
					type="checkbox" name="services" value="heavyequip"
					><span>Heavy Equipment</span></label> <label><input
					type="checkbox" name="services" value="fuel"
					><span>Fuel</span></label> <label><input
					type="checkbox" name="services" value="sandbags"
					><span>Sandbags</span></label> <label><input
					type="checkbox" name="services" value="tempfacility"
					><span>Temporary Facilities</span></label> <label><input
					type="checkbox" name="services" value="profserv"
					><span>Professional Services</span></label> <label><input
					type="checkbox" name="services" value="other"
					><span>Other (Please List)</span></label>
			</div>
			<div id="otherService" class="element-input">
				<label class="title"><span class="required">*</span>Other:</label>
				<div class="item-cont">
					<input class="large" type="text" name="serviceOther" 
						placeholder="Other..." /><span class="icon-place"></span>
				</div>
			</div>
			<span class="clearfix"></span>
		</div>
		<div class="element-input">
		    """),_display_(/*120.8*/if(profileForm.hasGlobalErrors)/*120.39*/ {_display_(Seq[Any](format.raw/*120.41*/("""
        		"""),format.raw/*121.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*122.16*/profileForm/*122.27*/.globalError.message),format.raw/*122.47*/("""
        		"""),format.raw/*123.11*/("""</span>
   			""")))}),format.raw/*124.8*/("""
		"""),format.raw/*125.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Submit" /> <a href="/"
				class="buttonCancel">"""),_display_(/*128.27*/Messages("goback")),format.raw/*128.45*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>
""")))}))
      }
    }
  }

  def render(profileForm:Form[Application.ProfileRegister]): play.twirl.api.HtmlFormat.Appendable = apply(profileForm)

  def f:((Form[Application.ProfileRegister]) => play.twirl.api.HtmlFormat.Appendable) = (profileForm) => apply(profileForm)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Thu Nov 10 10:02:27 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/profile/profile.scala.html
                  HASH: d81c317b065f9317944b347de7791f38eeaabb64
                  MATRIX: 784->1|927->49|957->54|975->64|1014->66|1042->68|12868->11866|12897->11867|12927->11869|12956->11870|14205->13091|14234->13092|14264->13094|14293->13095|16842->15617|16883->15648|16924->15650|16965->15662|17068->15737|17089->15748|17131->15768|17172->15780|17219->15796|17251->15800|17392->15913|17432->15931
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|69->38|69->38|69->38|69->38|97->66|97->66|97->66|97->66|151->120|151->120|151->120|152->121|153->122|153->122|153->122|154->123|155->124|156->125|159->128|159->128
                  -- GENERATED --
              */
          